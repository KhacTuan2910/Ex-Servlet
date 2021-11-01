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
	
	<input type="submit" value="Add product"></button>
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
			<td><input type="submit" value="Delete"></td>
		</tr>
	<%}%>
	</table>
</body>
</html>