<%
 String [] attributes = modelAttributes.replaceAll("(\r|\n\r)", "\n").split("\n")
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
<<%="%"%>@ include file="../header.jsp" <%="%"%>> 

<h1>${modelName} index</h1>

<table>
	<tr>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
		<td>${attrName}</td>
<% } %>
		<td>action</td>
	</tr>
	<c:forEach var="${lowercasedModelName}" items="\${${lowercasedModelName}List}">
		<tr>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
			<td>\${${lowercasedModelName}.${attrName}}</td>
<% } %>
			<td>
				<a href="${lowercasedModelName}.view.logic?${lowercasedModelName}.id=\${${lowercasedModelName}.id}">view</a>
				<a href="${lowercasedModelName}.edit.logic?${lowercasedModelName}.id=\${${lowercasedModelName}.id}">edit</a>
				<a href="${lowercasedModelName}.destroy.logic?${lowercasedModelName}.id=\${${lowercasedModelName}.id}">destroy</a>
			</td>
		</tr>
	</c:forEach>
</table>

<p>
	<a href="${lowercasedModelName}.creation.logic">new</a>
</p>

<<%="%"%>@ include file="../footer.jsp" <%="%"%>> 