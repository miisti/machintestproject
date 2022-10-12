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
<form action="./addproductmaster" method="post">
<h3>Enter Below Details to create Category Master :</h3>
<label>Category ID  :</label>
<input type="text" name="categoryid" placeholder="Category Id"> <br> <br>
<label>Category Name :</label>
<input type="text" name="categoryname" placeholder="Category Name"> <br> <br>

<input type="submit" value="Create">
<a href="index.jsp"><input type="button" value="Cancel"> </a>

</form>
</div>

</body>
</html>