<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Bankapplication/UpdateController">
<table>
<tr>
<td>Id</td>
<td><input type="text" name="id" value="${cust.id }" readonly/></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" value="${cust.name}" disabled/></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="address" value="${cust.address}" /></td>
</tr>
<tr>
<td>Salary</td>
<td><input type="text" name="sal" value="${cust.salary}" /></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city" value="${cust.city }" /></td>
</tr>
<tr>
<td>
<input type="submit" value="update"/>
</td>
</tr>
</table>
</form>
</body>
</html>