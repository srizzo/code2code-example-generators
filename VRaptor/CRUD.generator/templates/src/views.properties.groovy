<%
 String lowercasedModelName = modelName.replaceAll(/^./){it.toLowerCase()}; 
%>
copy to your views.properties:

${lowercasedModelName}.create.ok = redirect:${lowercasedModelName}.index.logic
${lowercasedModelName}.update.ok = redirect:${lowercasedModelName}.index.logic
${lowercasedModelName}.destroy.ok = redirect:${lowercasedModelName}.index.logic
