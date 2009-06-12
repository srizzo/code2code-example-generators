<%
 String [] attributes = modelAttributes.replaceAll("(\r|\n\r)", "\n").split("\n")
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
<<%="%"%>@ include file="../header.jsp" <%="%"%>> 

<h1>View ${modelName}</h1>

<table>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
	<tr><th><label for="${lowercasedModelName}.${attrName}">${attrName}</label></th><td>\${${lowercasedModelName}.${attrName}}</td></tr>
<% } %>
</table>

<p>
	<a href="${lowercasedModelName}.edit.logic?${lowercasedModelName}.id=\${${lowercasedModelName}.id}">edit</a> |
	<a href="${lowercasedModelName}.index.logic">back</a>
</p>

<<%="%"%>@ include file="../footer.jsp" <%="%"%>> 