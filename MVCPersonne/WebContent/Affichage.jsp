<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page import="iset.mvcpersonne.modele.Personne" %>
<%@ page import="java.util.ArrayList" %>
<meta charset="ISO-8859-1">
<title>Affichage</title>
</head>
<body>
<% ArrayList<Personne> l = (ArrayList<Personne>)(session.getAttribute("list")) ; %>
<table border="2">
<%  for (int i = 0; i < l.size(); i++)  { 
Personne p= l.get(i);  %>
<tr>
<td> nom : </td><td> <%=p.getNom() %> </td>

<td> prenom : </td><td> <%=p.getPrenom()%> </td>

<td> sexe : </td><td> <%=p.getSexe()%> </td>

<td> code postal : </td><td> <%=p.getCode()%> </td>
</tr>
<% } %>
</table>
</body>
</html>