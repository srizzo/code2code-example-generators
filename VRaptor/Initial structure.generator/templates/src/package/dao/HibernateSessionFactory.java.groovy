package ${basePackage}.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

public class HibernateSessionFactory {

	private static final Logger logger = Logger
			.getLogger(HibernateSessionFactory.class);

	private static final SessionFactory sessionFactory;

	private static final AnnotationConfiguration configuration;

	static {
		try {
			configuration = new AnnotationConfiguration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (Throwable ex) {
			logger.fatal("Something happened here!!! 8-O", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void create() {
		new SchemaExport(configuration).create(true, true);
	}

	public static void update() {
		new SchemaUpdate(configuration).execute(true, true);
	}

	public static void close() {
		sessionFactory.close();
	}

	public static Session openSession() {
		return sessionFactory.openSession();
	}

}