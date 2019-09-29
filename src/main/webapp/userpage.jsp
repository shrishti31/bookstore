<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user page</title>
</head>
<body>
<h2>SIGNUP</h2>
<form action="signup">
<input type="email" name="email" placeholder="email"><br>
<input type="password" name="password" placeholder="password"><br>
<input type="text" name="address" placeholder="address"><br>
<input type="text" name="pincode" placeholder="pincode"><br>
<input type="text" name="contactno" placeholder="contact number"><br>
<input type="submit" value="signup">
</form>

<h2>LOGIN</h2>
<form action="login">
<input type="text" name="email" placeholder="email"><br>
<input type="password" name="password" placeholder="password"><br>
<input type="submit" value="login">
</form>

<h2>VIEW ALL USERS</h2>
<form action="viewallusers">
<input type="submit" value="view">
</form>
<%=request.getAttribute("userrr") %>




<form action="addtocart">
<input type="number" palceholder="enter user id" name="uid">
<input type="number" placeholder="enter book id" name="bid">

<input type="submit" value="view">

</form>











</body>
</html>
