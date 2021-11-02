<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.cybersoft.java14.service.ProductService"%>
<%@ page import="com.cybersoft.java14.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	<%! ProductService productService = new ProductService();%>
	<form action="/BaiTapJsp01/add" method="post">
		<label>Name: </label>
		<input type="text" name="productName">
		<br>
		<label>Description: </label>
		<input type="text" name="description">
		<br>
		<label>Price: </label>
		<input type="text" name="price">
		<br>
		<label>Quantity: </label>
		<input type="text" name="quantity">
		<br>
		<input type="submit" value="Add product"></input>
	</form>
	<br>
	<table>
		<tr>
			<th>Name	</th>
			<th>Description	</th>
			<th>Price	</th>
			<th>Quantity	</th>
		</tr>		
	<%for(Product product : productService.getProducts()){%>
		<tr>
			<td><%= product.getName()%>	</td>
			<td><%= product.getDescription() %>	</td>
			<td><%= product.getPrice() %>	</td>
			<td><%= product.getQuantity() %></td>
			<td><input type="submit" value="Delete" action="/"></td>
		</tr>
	<%}%>
	</table>
</body>
</html>