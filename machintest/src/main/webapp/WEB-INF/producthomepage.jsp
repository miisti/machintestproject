<%@page import="com.test.machintest.CategoryMaster"%>
<%@page import="java.util.List"%>
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
	<div align="center">
		<h1>Welcome to Machine Test</h1>
		<h2>Product Master</h2>
	</div>

	<div align="left">
		<label>Search by Product ID :</label> <br>
		<form action="./findproduct" method="post">
			<br> <input type="text" name="productid"
				placeholder="Product Id"> <input type="submit"
				value="Search">
		</form>
		<div>
			<%
			ProductMaster find = (ProductMaster) request.getAttribute("findproduct");
			%>

			<%
			if (find != null) {
			%>
			<table border="3px">
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Action</th>

				</tr>
				<tr>

					<th><%=find.getProductid()%></th>
					<th><%=find.getProductname()%></th>


					<th><a href="./delete"> Delete</a> &nbsp; &nbsp; <a
						href="./edit"> Update</a></th>
				</tr>
				<%
				}
				%>
			</table>

		</div>

		<br> <br> <a href="./addproduct"> <input type="button"
			value="Add Product Master">
		</a>
	</div>

	<div align="center">

		<a href="./listproduct"><input type="button"
			value="Show Product Master"> </a> <br> <br>
		<%
		List<CategoryMaster> master = (List<CategoryMaster>) request.getAttribute("categorylist");
		List<ProductMaster> product = (List<ProductMaster>) request.getAttribute("productlist");
		%>
		<%
		if (master != null && product != null) {
		%>
		<table border="3px">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Category ID</th>
				<th>Category Name</th>
				<th>Action</th>


			</tr>
			<tr>
				<%
				for (int i = 0; i < 10; i++) {
				%>
			    <th><%=product.get(i).getProductid()%></th>
				<th><%=product.get(i).getProductname()%></th>
				<th><%=master.get(i).getCategoryid()%></th>
				<th><%=master.get(i).getCategoryname()%></th>

				<th><a href="./deleteproduct"> Delete</a> &nbsp; &nbsp; <a
					href="./updatePd"> Update</a></th>

			</tr>
			<%
			}	
			}
			%>
		</table>

	</div>


</body>
</html>