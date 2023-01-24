<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee Details</title>
</head>
<body>
	<h2>Edit Employee</h2>

	<s:form action="editEmp" method="post">
		<pre>
		<s:textfield label="Id" name="id" />
		<s:textfield label="Name" name="name" value="%{name}" />
		<s:textfield label="Email" name="email" value="%{email}" />
		<s:textfield label="Designation" name="designation"
				value="%{designation}" />
		<s:textfield label="Salary" name="salary" value="%{salary}" />
		<s:radio list="{'Male','Female'}" name="gender" value="%{gender}"></s:radio>
		<s:textfield label="Phone Number" name="phonenumber"
				value="%{phonenumber}" />
		<s:submit name="submitEmp" value="Edit Employee" />
		</pre>
	</s:form>
	<s:if test="flag>0">
		<span style="color: red;"><s:property value="msg" /></span><br>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span><br>
	</s:else>
<a href="showEmp">VIEW EMPLOYEE DETAILS</a>

</body>
</html>