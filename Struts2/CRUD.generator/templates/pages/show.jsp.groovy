<% attributes = attributes.split("\n") %>
<<%="%"%>@ taglib prefix="s" uri="/struts-tags"<%="%"%>>
<html>
	<head>
		<link rel="stylesheet" href="<s:url value="/css/application.css"/>" type="text/css">
	</head>
	<body>
		<h1>${entity}</h1>

		<table>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
			<tr><td>${attrName}:</td><td><s:property value="${entity.replaceAll(/^./){it.toLowerCase()}}.${attrName}" /></td></tr>
<% } %>		
		</table>

		<a href="<s:url action="index"/>">Back to list</a>

		<s:url id="removeUrl" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="remove"><s:param name="id" value="${entity.replaceAll(/^./){it.toLowerCase()}}.id" /></s:url>
		<s:a href="%{removeUrl}">Remove</s:a>
		<s:url id="editUrl" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="edit"><s:param name="id" value="${entity.replaceAll(/^./){it.toLowerCase()}}.id" /></s:url>
		<s:a href="%{editUrl}">Edit</s:a>
	</body>
</html>