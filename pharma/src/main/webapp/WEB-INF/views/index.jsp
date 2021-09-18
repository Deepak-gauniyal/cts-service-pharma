<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.cen{
	align-items: center;
	text-align: center;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class=cen>
	<h1> Welcome to CTS Pharma Services</h1>
	<br><br>
	<form action="db/medicine" method="post">

		Medicine Name:
		<input type="text" name="name"/><br><br>
		Medicine Price:
		<input type="text" name="price"/><br><br>
		Medicine Composition:
		<br><br>
		<input type="checkbox" name="composition" value="pcm"/>
		PCM
		<br>
		<input type="checkbox" name="composition" value="amoxlylin"/>
		Amoxilin
		<br>
		<input type="checkbox" name="composition" value="diclofenac"/>
		Diclofenac
		<br>
		<input type="checkbox" name="composition" value="benadryl"/>
		Benadryl
		<br><br><br>
		<input type="submit" style="width: 200px; color: blue;" value="ADD"/>





</form>
</body>
</html>