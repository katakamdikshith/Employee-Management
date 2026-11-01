<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee</title>
</head>
<body>
	<h2>Add Employees</h2>
	
	<form action="save" method="post">
		<label for="empname"> Employee Name : </label>
		<input type="text" name="empname" placeholder="Enter Employee Name"><br><br>
		
		<label for="empmail"> Employee Mail : </label>
		<input type="text" name="empmail" placeholder="Enter Employee mail"><br><br>
	
		<label for="empsalary"> Employee Salary : </label>
		<input type="text" name="empsalary" placeholder="Enter Employee Salary"><br><br>
		
		<label for="empage"> Employee Age : </label>
		<input type="text" name="empage" placeholder="Enter Employee Age"><br><br>
	
		<label for="empdept"> Employee Department : </label>
		<input type="text" name="empdept" placeholder="Enter Employee Department"><br><br>
		
		<input type="submit" value="Add">
	</form>
</body>
</html>