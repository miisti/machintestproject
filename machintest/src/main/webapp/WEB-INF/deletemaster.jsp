<%@page import="com.test.machintest.CategoryMaster"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<label>Re Enter category ID to Delete the Data:</label>
	<br>
	<form action="./deleted" method="post">
		<br> <input type="text" name="categoryid"
			placeholder="Category Id"> <input type="submit"
			value="Search">
	</form>
	</div>
</body>
</html>