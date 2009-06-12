<%
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
copy to your index.jsp

<a href="${lowercasedModelName}.index.logic">${modelName} index</a>

