<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>
	
<h2>Signup</h2>
<form action="signup" method="post">
	<label for="username"> UserName : </label>
	<input type="text" name="username" placeholder="Enter your username"> <br><br>
	
	<label for="password"> Password : </label>
	<input type="password" name="password" placeholder="Enter your password"><br><br>
	
	<input type="submit" value="Signup">
</form>
<p>Are You an existing user? <a href="index.jsp"> Login </a></p>

</body>
</html>