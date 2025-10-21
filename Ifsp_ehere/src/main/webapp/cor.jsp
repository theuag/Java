<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String cor = "#ffff00";

	for( Cookie c: request.getCookies() ){
		if( c.getName().equals("matheus") )
			cor = c.getValue();
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background-color: <%= cor %>;	
	}
</style>
</head>
<body>

<form action="cookie" method="post">

	<table>
		<tr>
			<td>Escolha o Tema:</td>
			<td><input type="color" name="theme"/></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="Definir"/></td>
		</tr>
	</table>
	

</form>






</body>
</html>