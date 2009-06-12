<%
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
package ${basePackage}.dao;

import java.util.List;

import org.hibernate.Session;

import ${basePackage}.model.${modelName};

public class ${modelName}Dao {

	private Session session;

	${modelName}Dao(Session session) {
		this.session = session;
	}

	public void create(${modelName} ${lowercasedModelName}) {
		session.save(${lowercasedModelName});
	}

	public void refresh(${modelName} ${lowercasedModelName}) {
		session.refresh(${lowercasedModelName});
	}

	public void update(${modelName} ${lowercasedModelName}) {
		session.update(${lowercasedModelName});
	}

	@SuppressWarnings("unchecked")
	public List<${modelName}> listAll() {
		return session.createCriteria(${modelName}.class).list();
	}
	
	public ${modelName} get(Long id){
		return (${modelName}) session.get(${modelName}.class, id);
	}

	public void delete(${modelName} ${lowercasedModelName}) {
		session.delete(${lowercasedModelName});
	}

}
