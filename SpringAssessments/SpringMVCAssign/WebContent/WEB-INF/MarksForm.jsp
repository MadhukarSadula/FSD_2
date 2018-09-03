<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Marks Form</h1>
<form action="/SubmitForm" method="post"></form>
<p>
    Science Marks : <input type="text" name="sciencemarks"/>
</p>
<p>
    Maths Marks :   <input type="text" name="mathsmarks"/>
</p>
<p>
    English Marks : <input type="text" name="englishmarks"/>
</p>
<input type="submit" value="Submit marks">
</body>
</html>