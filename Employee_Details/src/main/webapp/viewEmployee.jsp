<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, td, th {
	border: 1px solid black;
	text-align: center;
}

table {
	border-collapse: collapse;
	width: 60%;
}

th {
	height: 30px;
}
</style>
</head>
<body>
	<h2 align="center">EMPLOYEE DETAILS</h2>
	<table>

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>Gender</th>
			<th>Phone Number</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="emplist">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="designation" /></td>
				<td><s:property value="salary" /></td>
				<td><s:property value="gender" /></td>
				<td><s:property value="phonenumber" /></td>
				<td><a href="editEmp.action?submitEmp=editdata&id=<s:property value="id"/>">Edit </a></td>
				<td><a href="deleteEmp.action?id=<s:property value="id"/>">Delete</a></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>