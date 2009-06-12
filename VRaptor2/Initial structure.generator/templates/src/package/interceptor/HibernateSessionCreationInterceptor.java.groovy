package ${basePackage}.interceptor;

import org.hibernate.Session;
import org.vraptor.Interceptor;
import org.vraptor.LogicException;
import org.vraptor.LogicFlow;
import org.vraptor.annotations.Out;
import org.vraptor.view.ViewException;

import ${basePackage}.dao.HibernateSessionFactory;

public class HibernateSessionCreationInterceptor implements Interceptor {

	private Session session;

	public void intercept(LogicFlow flow) throws LogicException, ViewException {
		session = HibernateSessionFactory.openSession();
		try {
			flow.execute();
		} finally {
			session.close();
		}
	}
	
	@Out(key = "hibernateSession")
	public Session getSession() {
		return session;
	}
}
