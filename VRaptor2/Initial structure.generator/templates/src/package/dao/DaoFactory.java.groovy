package ${basePackage}.dao;

import org.hibernate.Session;

public class DaoFactory {

	private final Session session;

	public DaoFactory(Session session) {
		this.session = session;
	}

}
