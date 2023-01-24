<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>Employee form</h2>

	<s:form action="addEmp" method="post">
		<s:textfield label="Employee Id" name="id" />
		<s:textfield label="Full Name" name="name" />
		<s:textfield label="Email" name="email" />
		<s:textfield label="Designation" name="designation" />
		<s:textfield label="Salary" name="salary" />
		<s:radio list="{'Male','Female'}" name="gender"></s:radio>
		<s:textfield label="Phone Number" name="phonenumber" />
		<s:submit value="Add Employee" />
	</s:form>
	<s:if test="flag>0">
		<span style="color: green;"><s:property value="msg" /></span><br>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span><br>
	</s:else>
<a href="showEmp">VIEW EMPLOYEE DETAILS</a>
</body>
</html>