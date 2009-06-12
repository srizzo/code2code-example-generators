templates/src/hibernate.cfg.xml.groovy=
templates/src/package/model/Model.java.groovy=src/${basePackage.replace(".", "/")}/model/${modelName}.java

templates/src/package/dao/ModelDao.java.groovy=src/${basePackage.replace(".", "/")}/dao/${modelName}Dao.java
templates/src/package/dao/DaoFactory.java.groovy=


templates/src/package/logic/ModelLogic.java.groovy=src/${basePackage.replace(".", "/")}/logic/${modelName}Logic.java

templates/src/views.properties.groovy=


templates/WebContent/model/view.ok.jsp.groovy=WebContent/${modelName.replaceAll(/^./){it.toLowerCase()}}/view.ok.jsp
templates/WebContent/model/index.ok.jsp.groovy=WebContent/${modelName.replaceAll(/^./){it.toLowerCase()}}/index.ok.jsp
templates/WebContent/model/edit.ok.jsp.groovy=WebContent/${modelName.replaceAll(/^./){it.toLowerCase()}}/edit.ok.jsp
templates/WebContent/model/creation.ok.jsp.groovy=WebContent/${modelName.replaceAll(/^./){it.toLowerCase()}}/creation.ok.jsp

templates/WebContent/index.jsp.groovy=

