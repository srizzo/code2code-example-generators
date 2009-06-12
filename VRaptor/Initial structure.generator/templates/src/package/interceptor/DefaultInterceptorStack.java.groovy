package ${basePackage}.interceptor;

import org.vraptor.InterceptorStack;

public class DefaultInterceptorStack extends InterceptorStack{

	@SuppressWarnings("unchecked")
	public DefaultInterceptorStack() {
		super(HibernateSessionCreationInterceptor.class,
				TransactionManagementInterceptor.class,
				DaoFactoryInjectionInterceptor.class
				);
	}
}
