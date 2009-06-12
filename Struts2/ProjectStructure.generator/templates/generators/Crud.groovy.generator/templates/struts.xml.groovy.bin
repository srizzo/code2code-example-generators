    <package name="${entity.replaceAll(/^./){it.toLowerCase()}}" extends="struts-default" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}">

        <action name="index" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result>/pages/${entity.replaceAll(/^./){it.toLowerCase()}}/index.jsp</result>
        </action>


        <action name="new" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result>/pages/${entity.replaceAll(/^./){it.toLowerCase()}}/new.jsp</result>
        </action>

        <action name="create" method="create" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result type="redirect-action">
            	<param name="actionName">index</param>
              	<param name="msg">${entity} successfully created!</param>
            </result>
        </action>

        <action name="show" method="show" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result>/pages/${entity.replaceAll(/^./){it.toLowerCase()}}/show.jsp</result>
        </action>


        <action name="edit" method="edit" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result>/pages/${entity.replaceAll(/^./){it.toLowerCase()}}/edit.jsp</result>
        </action>
        
        <action name="update" method="update" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result type="redirect-action">
            	<param name="actionName">index</param>
	         	<param name="msg">${entity} successfully updated!</param>
            </result>
        </action>
        

        <action name="remove" method="remove" class="${entity.replaceAll(/^./){it.toLowerCase()}}Action">
            <result type="redirect-action">
            	<param name="actionName">index</param>
	           	<param name="msg">${entity} successfully removed!</param>
            </result>
        </action>

    </package>
