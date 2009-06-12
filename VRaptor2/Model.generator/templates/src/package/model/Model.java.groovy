<% String [] attributes = modelAttributes.replaceAll("(\r|\n\r)", "\n").split("\n")
%>package ${basePackage}.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ${modelName} implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
<% attributes.each{ %>
	private ${it.split(/:/)[1]} ${it.split(/:/)[0]};
<% } %>

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
<% attributes.each{
	String attrName = it.split(/:/)[0];
	String attrType = it.split(/:/)[1];
 %>
	public ${attrType} get${attrName.replaceAll(/^./){it.toUpperCase()}}() {
		return ${attrName};
	}

	public void set${attrName.replaceAll(/^./){it.toUpperCase()}}(${attrType} ${attrName}) {
		this.${attrName} = ${attrName};
	}
<% } %>


}