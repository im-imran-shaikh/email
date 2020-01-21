<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
#textboxid {
	height: 25px;
	font-size: 14pt;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/sendEmail">
		<h2>
			Enter recipient email address &nbsp; <input id="textboxid"
				type="text" name="recipient"
				, placeholder="Recipient" , style = "width : 300px", required /> <br> <br>
			Enter subject &nbsp; <input id="textboxid" type="text" name="subject"
				, placeholder="Subject" , style="width: 500px"
				,  required /> <br>
			<br> Enter Body &nbsp; <textarea  name="body"
				row = 30, cols = 100, style="height : 100px; font-size: 14pt" required > </textarea> <br>
			<br> 
			<br> <input id="textboxid" type="submit" , value="send email"
				, style="margin-left: 10%; background-color : green"  /> <input id="textboxid" type = "Reset", value = "clear" style="margin-left : 2%; background-color : red"/>
		</h2>
	</form>
</body>
</html>