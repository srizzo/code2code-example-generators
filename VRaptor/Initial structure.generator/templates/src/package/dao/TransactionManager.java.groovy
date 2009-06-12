package ${basePackage}.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransactionManager {

	private static final Logger LOG = Logger.getLogger(TransactionManager.class);

	private final Session session;
	private Transaction transaction;

	public TransactionManager(Session session) {
		this.session = session;
	}

	public void close() {
		if (this.session.isOpen()) {
			try {
				if (this.hasTransaction()) {
					this.rollback();
				}
			} catch (HibernateException e) {
				LOG.fatal("exception rolling back", e);
			} finally {
				this.session.close();
			}
		}
	}

	public void beginTransaction() {
		if (this.hasTransaction()) {
			this.rollback();
			throw new IllegalStateException(
					"There is no nested transaction support!");
		}
		this.transaction = this.session.beginTransaction();
	}

	public void flush() {
		this.session.flush();
	}

	public void commit() {
		this.session.flush();
		this.transaction.commit();
		this.transaction = null;
	}

	public void rollback() {
		this.transaction.rollback();
		this.transaction = null;
	}

	public boolean hasTransaction() {
		return this.transaction != null && this.transaction.isActive();
	}

	public Session getSession() {
		return session;
	}
	
}
