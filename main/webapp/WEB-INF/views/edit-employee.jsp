<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee</title>
</head>
<body>
	<h2>Edit Employees</h2>
	
	<form action="${pageContext.request.contextPath}/flm/employees/update" method="post">
	
		<input type="text" value="${employee.employeeId}" name="empId" hidden="true">
	
		<label for="empname"> Employee Name : </label>
		<input type="text" value="${employee.employeeName}" name="empname" placeholder="Enter Employee Name"><br><br>
		
		<label for="empmail"> Employee Mail : </label>
		<input type="text" value="${employee.employeeEmail}" name="empmail" placeholder="Enter Employee mail"><br><br>
	
		<label for="empsalary"> Employee Salary : </label>
		<input type="text" value="${employee.employeeSalary}" name="empsalary" placeholder="Enter Employee Salary"><br><br>
		
		<label for="empage"> Employee Age : </label>
		<input type="text" value="${employee.employeeAge}" name="empage" placeholder="Enter Employee Age"><br><br>
	
		<label for="empdept"> Employee Department : </label>
		<input type="text" value="${employee.employeeDepartment}" name="empdept" placeholder="Enter Employee Department"><br><br>
		
		<input type="submit" value="Edit">
	</form>
</body>
</html>
</html>