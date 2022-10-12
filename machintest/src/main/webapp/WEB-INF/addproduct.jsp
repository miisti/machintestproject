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
		<form action="./addmaster" method="post">
			<h3>Enter Below Details to create Product Master :</h3>
			<label>Product ID :</label> <input type="text" name="productid"
				placeholder="Product Id"> <br> <br> <label>Product
				Name :</label> <input type="text" name="productname"
				placeholder="Product Name"> <br> <br> <input
				type="submit" value="Create"> <a
				href="/WEB-INF/producthomepage.jsp";><input type="button"
				value="Cancel"> </a>

		</form>
	</div>

</body>
</html>