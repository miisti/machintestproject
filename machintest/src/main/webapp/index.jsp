<%@page import="com.test.machintest.CategoryMaster"%>
<%@page import="java.util.List"%>
<html>
<body>
<div align="center">
	<h1>Welcome to Machine Test</h1>
			<h2>Category Master</h2>
	</div>
	<div align="left">
	<label>Search by category ID :</label> <br>
		<form action="./find" method="post">
			<br> <input type="text" name="categoryid"
			placeholder="Category Id"> <input type="submit"
			value="Search"></form>
			<div>
			<% CategoryMaster find = (CategoryMaster)request.getAttribute("find"); %>
		
			<% if(find!= null) {%>
		<table border="3px">
		<tr>
		<th>Category ID </th>
		<th>Category Name </th>
		<th>view </th>
		<th>Action</th>
		
		</tr>
		<tr>
		
		<th> <%=find.getCategoryid()%> </th>
		<th> <%=find.getCategoryname()%> </th>
		
		<th> 
		<a href="./producthomepage">Product List</a> &nbsp; &nbsp;
		</th>
		<th> 
		<a href="./delete"> Delete</a> &nbsp; &nbsp; 
		<a href="./edit"> Update</a> 
		</th>
		</tr>
		<%} %></table>
		
			</div>

		 <br> <br> <a href="./add"> <input type="button"
			value="Add Product Master">
		</a>
	</div>
	
	<div align="center">

		<a href="./list"><input type="button" value="Show Category Master">
		</a> <br> <br>
		<%
		List<CategoryMaster> master = (List<CategoryMaster>) request.getAttribute("list");
		%>
		<% if(master!= null) {%>
		<table border="3px">
		<tr>
		<th>Category ID </th>
		<th>Category Name </th>
		<th>view </th>
		<th>Action</th>
		
		
		</tr>
		<tr>
		<% for(int i =0; i<master.size();i++){ %>
		<th> <%=master.get(i).getCategoryid()%> </th>
		<th> <%=master.get(i).getCategoryname()%> </th>
		<th> 
		<a href="./producthomepage">Product List</a> &nbsp; &nbsp;
		</th>
		<th> 
		<a href="./delete"> Delete</a> &nbsp; &nbsp; 
		<a href="./edit"> Update</a> 
		</th>
		
		</tr>
		<%} }%></table>
		
	</div>
</body>
</html>
