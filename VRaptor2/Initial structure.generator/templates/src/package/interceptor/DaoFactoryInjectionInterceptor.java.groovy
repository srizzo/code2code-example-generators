package ${basePackage}.interceptor;

import org.hibernate.Session;
import org.vraptor.Interceptor;
import org.vraptor.LogicException;
import org.vraptor.LogicFlow;
import org.vraptor.annotations.In;
import org.vraptor.annotations.Out;
import org.vraptor.view.ViewException;

import ${basePackage}.dao.DaoFactory;

public class DaoFactoryInjectionInterceptor implements Interceptor {

	@In(key="hibernateSession")
	private Session session;

	private DaoFactory daoFactory;

	public void intercept(LogicFlow flow) throws LogicException, ViewException {
		daoFactory = new DaoFactory(session);
		flow.execute();
	}
	
	@Out(key = "daoFactory")
	public DaoFactory getDaoFactory() {
		return daoFactory;
	}
}
