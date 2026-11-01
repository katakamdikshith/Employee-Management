<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.entity.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
	
	<h1>Employees Management</h1>
	
	<a href="newemployee">Add Employee</a><br><br>
	<table border="1">
	
		<tr>
			<th> Employee ID </th>
			<th> Employee Name </th>
			<th> Employee Email </th>
			<th> Employee Age </th>
			<th> Employee Department </th>
			<th> Employee Salary </th>
			<th> Actions </th>
		</tr>
		
	<%List<Employee> empList = (List<Employee>) request.getAttribute("empList");
		for(Employee emp : empList) { 
		%>
		
		<tr>
			<td> <%= emp.getEmployeeId() %>  </td>
			<td> <%= emp.getEmployeeName() %> </td>
			<td> <%= emp.getEmployeeEmail() %> </td>
			<td> <%= emp.getEmployeeAge() %> </td>
			<td> <%= emp.getEmployeeDepartment() %> </td>
			<td> <%= emp.getEmployeeSalary() %> </td>
			<td> <a href="employees/update/<%= emp.getEmployeeId() %>">Update</a>  | <a href="employees/delete/<%= emp.getEmployeeId() %>">Delete</a> </td>
		</tr>
		
	<% } %>
	</table>
	
</body>
</html>