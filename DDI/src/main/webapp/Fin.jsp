<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>El pais introducido es: ${nam}</h1>
	<h1> La lengua hablada es ${lengua2}</h1>
	<br>
	<input type="button" onclick="window.location.href='Inicio.jsp'"  value="Volver">
	<br>
	<form method="post" action="Hola">
		<input type="hidden" value="${nam}" name="pais">
		<br>
		<input type="submit"  value="Borrar">
	</form>	
</body>
</html>