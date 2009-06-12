<%
 String [] attributes = modelAttributes.replaceAll("(\r|\n\r)", "\n").split("\n")
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
<<%="%"%>@ include file="../header.jsp" <%="%"%>> 

<h1>Edit ${modelName}</h1>

<w:form action="${lowercasedModelName}.update.logic" method="post">
	<w:hidden name="${lowercasedModelName}.id"/>
	<table>
<% attributes.each{
	String attrName = it.split(/:/)[0];
 %>
		<tr><th><label for="${lowercasedModelName}.${attrName}">${attrName}</label></th><td><w:text name="${lowercasedModelName}.${attrName}" /></td></tr>
<% } %>
	</table>
	<w:submit/>
</w:form>

<p>
	<a href="${lowercasedModelName}.index.logic">back</a>
</p>


<<%="%"%>@ include file="../footer.jsp" <%="%"%>> 