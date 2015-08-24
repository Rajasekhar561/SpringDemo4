<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightgray">
<form action="FileUploadin" method="post" enctype="multipart/form-data">
<center>

<h1 style="color:red">Registration page</h1>
FirstName:<input type="text" name="firstName"  required="required"><br><br>
LastName:<input type="text" name="lastName" required="required"><br><br>
Gender:<input type="radio" name="gender" value="male">Male
    <input type="radio" name="gender" value="female">Female<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;PhoneNumber:<input type="text" name="number"><br><br>

Email:<input type="email" name="email" required="required"><br><br>
UserName:<input type="text" name="userName" required="required"><br><br>
Password:<input type="password" name="password" required="required"><br><br>
Upload Resume:<input type="file" name="file" required="required" size="50"/><br><br>
<input type="submit" value="submit">
<%-- <% RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
rd.forward(request, response);%> --%>


</center>
</form>
</body>
</html>