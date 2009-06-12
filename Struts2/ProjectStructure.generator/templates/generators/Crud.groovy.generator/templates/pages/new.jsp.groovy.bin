<% attributes = attributes.split("\n") %>
<<%="%"%>@ taglib prefix="s" uri="/struts-tags"<%="%"%>>
<html>
	<head>
		<link rel="stylesheet" href="<s:url value="/css/application.css"/>" type="text/css">
	</head>
	<body>
		<h1>Create ${entity}</h1>
		<s:form namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="create">
		    <s:hidden name="${entity.replaceAll(/^./){it.toLowerCase()}}.id"/>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
			<s:textfield label="${attrName}" name="${entity.replaceAll(/^./){it.toLowerCase()}}.${attrName}"/>
<% } %>
			<s:submit/>
		</s:form>
		<a href="<s:url action="index"/>">Back to list</a>
	</body>
</html>