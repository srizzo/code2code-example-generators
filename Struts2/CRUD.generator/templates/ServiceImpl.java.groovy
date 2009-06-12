package ${basePackage}.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import ${basePackage}.model.${entity};

@Transactional
public class ${entity}ServiceImpl implements ${entity}Service {
    private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @SuppressWarnings("unchecked")
    public List<${entity}> findAll() {
        return em.createQuery("select p from ${entity} p").getResultList();
    }

    public void create(${entity} ${entity.replaceAll(/^./){it.toLowerCase()}}) {
    	em.persist(${entity.replaceAll(/^./){it.toLowerCase()}});
    	
    }

    public ${entity} find(long id) {
    	return em.find(${entity}.class, id);
    }


	public void update(${entity} ${entity.replaceAll(/^./){it.toLowerCase()}}) {
		 em.merge(${entity.replaceAll(/^./){it.toLowerCase()}});
	}

	public void remove(long id) {
		${entity} ${entity.replaceAll(/^./){it.toLowerCase()}} = find(id);
		if (${entity.replaceAll(/^./){it.toLowerCase()}} != null) {
			em.remove(${entity.replaceAll(/^./){it.toLowerCase()}});
		}
	}
	
}