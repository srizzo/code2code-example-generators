<%
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
package ${basePackage}.logic;

import java.util.List;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.In;
import org.vraptor.annotations.InterceptedBy;
import org.vraptor.annotations.Out;
import org.vraptor.scope.ScopeType;

import ${basePackage}.dao.DaoFactory;
import ${basePackage}.interceptor.DefaultInterceptorStack;
import ${basePackage}.model.${modelName};

@Component("${lowercasedModelName}")
@InterceptedBy(DefaultInterceptorStack.class)
public class ${modelName}Logic {

	@In(key="daoFactory")
	private DaoFactory daoFactory;

	private List<${modelName}> ${lowercasedModelName}List;
	private ${modelName} ${lowercasedModelName};
	private String message;
	
	public void index() {
		this.${lowercasedModelName}List = daoFactory.get${modelName}Dao().listAll();
	}
	
	public void view(${modelName} ${lowercasedModelName}) {
		this.daoFactory.get${modelName}Dao().refresh(${lowercasedModelName});
		this.${lowercasedModelName} = ${lowercasedModelName};
		
	}

	public void creation(){
		this.${lowercasedModelName} = new ${modelName}();
	}
	

	public void create(${modelName} ${lowercasedModelName}) {
		this.daoFactory.get${modelName}Dao().create(${lowercasedModelName});
		message = "${modelName} created";
	}

	public void edit(${modelName} ${lowercasedModelName}){
		daoFactory.get${modelName}Dao().refresh(${lowercasedModelName});
		this.${lowercasedModelName} = ${lowercasedModelName};
	}
	
	public void update(${modelName} ${lowercasedModelName}) {
		this.daoFactory.get${modelName}Dao().update(${lowercasedModelName});
		message = "${modelName} udpated";
	}
	
	public void destroy(${modelName} ${lowercasedModelName}) {
		
		this.daoFactory.get${modelName}Dao().refresh(${lowercasedModelName});
		this.daoFactory.get${modelName}Dao().delete(${lowercasedModelName});
		message = "${modelName} deleted";
	}
	
	
	public List<${modelName}> get${modelName}List() {
		return ${lowercasedModelName}List;
	}
	
	public ${modelName} get${modelName}() {
		return ${lowercasedModelName};
	}
	
	@Out(scope=ScopeType.FLASH)
	public String getMessage() {
		return message;
	}
	
}
