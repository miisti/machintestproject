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
<label>Enter Category ID for which you want to update the Data</label>
<form action="./updated" method="Post">
<input type="text" name="categoryid" placeholder="category id"> <br> <br>
<input type="submit" value="search"> <br> <br>
</form>
<% CategoryMaster master = (CategoryMaster) request.getAttribute("emp"); %>
<% if(master!= null) {%>
<form action="updateData" method="post">
Old Name : <%= master.getCategoryname() %>
new Name : <input type="text" name="newName">
<input type="submit" value="SUBMIT">
</form>
<%} %>

</body>
</html>