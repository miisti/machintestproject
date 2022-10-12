<%@page import="com.test.machintest.ProductMaster"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<label>Enter Product ID for which you want to update the Data</label>
<form action="./updatedproduct" method="Post">
<input type="text" name="productid" placeholder="Product id"> <br> <br>
<input type="submit" value="search"> <br> <br>
</form>
<% ProductMaster product = (ProductMaster) request.getAttribute("product"); %>
<% if(product!= null) {%>
<form action="./productdata" method="post">
Old Name : <%= product.getProductname() %>
new Name : <input type="text" name="newName">
<input type="submit" value="SUBMIT">
</form>
<%} %>


</body>
</html>