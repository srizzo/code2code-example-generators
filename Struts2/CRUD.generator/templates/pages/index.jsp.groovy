<% attributes = attributes.split("\n") %>
<<%="%"%>@ taglib prefix="s" uri="/struts-tags"<%="%"%>>
<html>
	<head>
		<link rel="stylesheet" href="<s:url value="/css/application.css"/>" type="text/css">
	</head>
	<body>
		<h1>${entity} List</h1>
		<div><strong><s:property value="msg"/></strong></div>
		<s:if test="${entity.replaceAll(/^./){it.toLowerCase()}}List.size gt 0">
			<table>
				<s:iterator value="${entity.replaceAll(/^./){it.toLowerCase()}}List">
					<tr id="row_<s:property value="id"/>">
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>						<td><s:property value="${attrName}" /></td>
<% } %>
						<td>
							<s:url id="showUrl" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="show"><s:param name="id" value="id" /></s:url>
							<s:a href="%{showUrl}">Show</s:a>
							<s:url id="editUrl" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="edit"><s:param name="id" value="id" /></s:url>
							<s:a href="%{editUrl}">Edit</s:a>
							<s:url id="removeUrl" namespace="/${entity.replaceAll(/^./){it.toLowerCase()}}" action="remove"><s:param name="id" value="id" /></s:url>
							<s:a href="%{removeUrl}">Remove</s:a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<a href="<s:url action="new"/>">New ${entity}</a>
	</body>
</html>