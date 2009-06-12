package ${basePackage}.interceptor;

import org.hibernate.Session;
import org.vraptor.Interceptor;
import org.vraptor.LogicException;
import org.vraptor.LogicFlow;
import org.vraptor.annotations.In;
import org.vraptor.annotations.Out;
import org.vraptor.view.ViewException;

import ${basePackage}.dao.TransactionManager;

public class TransactionManagementInterceptor implements Interceptor {

	@In(key="hibernateSession")
	private Session session;

	private TransactionManager transactionManager;

	public void intercept(LogicFlow flow) throws LogicException, ViewException {
		transactionManager = new TransactionManager(session);
		transactionManager.beginTransaction();
		try{
			flow.execute();
			transactionManager.commit();
		}catch (Exception e) {
			transactionManager.rollback();
			throw new RuntimeException(e);
		}
	}
	
	@Out(key = "transactionManager")
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}
}