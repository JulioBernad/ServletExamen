<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.edu.DDI.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrar</title>
</head>
<body>

		<form method="post" action="Servlet3">	
		<input type="submit"  value="Mostrar">
		<input type="button" onclick="window.location.href='Inicio.jsp'"  value="Volver">
</form>	
<br>
<br>
<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
				<td>Lengua</td>
				<td>Borrar</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user1" items="${listAllUsers}">
				<tr>
					<td><c:out value="${user1.nombre}"/> </td>
					<td><c:out value="${user1.lengua}"/> </td>
					<td><a name="lengua" href="Hola?lengua=${user1.lengua}">Borrar</a></td>
		    	</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>