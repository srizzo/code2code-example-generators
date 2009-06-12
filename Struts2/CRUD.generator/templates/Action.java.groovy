package ${basePackage}.action;

import java.util.List;

import ${basePackage}.model.${entity};
import ${basePackage}.service.${entity}Service;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ${entity}Action extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;
	private ${entity}Service ${entity.replaceAll(/^./){it.toLowerCase()}}Service;
    private ${entity} ${entity.replaceAll(/^./){it.toLowerCase()}};
    private Long id;

    private String msg;
    
    
    public ${entity}Action(${entity}Service ${entity.replaceAll(/^./){it.toLowerCase()}}Service) {
        this.${entity.replaceAll(/^./){it.toLowerCase()}}Service = ${entity.replaceAll(/^./){it.toLowerCase()}}Service;
    }


	public void prepare() throws Exception {
        ${entity.replaceAll(/^./){it.toLowerCase()}} = new ${entity}();
	}
    

    public String create() {
        ${entity.replaceAll(/^./){it.toLowerCase()}}Service.create(${entity.replaceAll(/^./){it.toLowerCase()}});
        return SUCCESS;
    }

    public String show() {
        ${entity.replaceAll(/^./){it.toLowerCase()}} = ${entity.replaceAll(/^./){it.toLowerCase()}}Service.find(id);
        return SUCCESS;
    }
    
    
    public String edit() {
        ${entity.replaceAll(/^./){it.toLowerCase()}} = ${entity.replaceAll(/^./){it.toLowerCase()}}Service.find(id);
        return SUCCESS;
    }
    
    public String update() {
        ${entity.replaceAll(/^./){it.toLowerCase()}}Service.update(${entity.replaceAll(/^./){it.toLowerCase()}});
        return SUCCESS;
    }
        

    public String remove() {
        ${entity.replaceAll(/^./){it.toLowerCase()}}Service.remove(id);
        return SUCCESS;
    }
    
    
    
    public void setId(Long id) {
    	this.id = id;
    }


    public void set${entity}(${entity} ${entity.replaceAll(/^./){it.toLowerCase()}}) {
        this.${entity.replaceAll(/^./){it.toLowerCase()}} = ${entity.replaceAll(/^./){it.toLowerCase()}};
    }
    
    
    public List<${entity}> get${entity}List() {
        return ${entity.replaceAll(/^./){it.toLowerCase()}}Service.findAll();
    }


    public ${entity} get${entity}() {
        return ${entity.replaceAll(/^./){it.toLowerCase()}};
    }


    public String getMsg() {
		return msg;
	}
    
    public void setMsg(String msg) {
		this.msg = msg;
	}



}