<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<form method="post" action="hello">
	<table width="40%" align="center">
		<tr>
			<td colspan="2" align="center"><h2>Examen Desarrollo de Interfaces</h2><hr></td>
		</tr>
		<tr>
			<td><p>Nombre del pa�s:</p></td>
			<td><input type="text" id="pa" name="pa" size="30"></td>
		</tr>
		<tr>
			<td><p>Lengua en la base de datos</p></td>
			<td>
				<select name="lengua1" class="cuadro" id="lengua1" onChange="Cambia(this)">
					<option selected="selected">Seleccione una Opcion...</option>
						
				</select> 
			</td>
		</tr>
		<tr>
			<td><p>Lengua a introducir por el usuario</p></td>
			<td><input type="text" id="lengua2" name="lengua2" size="30"></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Enviar"></td>
		</tr>
		<tr>
			<td colspan="2" align="left"><input type="button" onclick="window.location.href='mostrar.jsp'"  value="Mostrar Usuarios"></td>
		</tr>
	</table>
</form>
</body>
</html>