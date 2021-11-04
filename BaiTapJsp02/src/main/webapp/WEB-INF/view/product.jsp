<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Product page</title>
</head>
<body>
	<div class="container-fluid">
      <h1>Product Management</h1>
      
      <form action="/BaiTapJsp02/product/add" method="post" class="mt-5">
      	  <label>Id</label>
          <br>
          <input type="text" name="id">
          <br>
          <label class="mt-3">Name</label>
          <br>
          <input type="text" name="name">
          <br>
          <label class="mt-3">Description</label>
          <br>
          <input type="text" name="desc">
          <br>
          <label class="mt-3">Price</label>
          <br>
          <input type="text" name="price">
          <br>
          <label class="mt-3">Stock</label>
          <br>
          <input type="text" name="stock">
          <br>
          <input type="submit" value="Add" class="btn btn-primary btn-block mt-4">
      </form>
      
      <table class="table mt-5">
          <thead>
              <tr>
                  <th>ID</th>
                  <th>Name</th>
                  <th>Description</th>
                  <th>Price</th>
                  <th>Stock</th>
                  <th>#</th>
              </tr>
          </thead>
          <tbody>
          	<c:forEach var="product" items="${products}">
              <tr>
                  <td>${product.id}</td>
                  <td>${product.name}</td>
                  <td>${product.description}</td>
                  <td>$${product.price}</td>
                  <td>${product.stock}</td>
                  <td><a class="btn btn-danger btn-sm text-white" href="<%= request.getContextPath()%>/product/remove?id=${product.id}">Remove</a></td>
              </tr>
          	</c:forEach>
          </tbody>
      </table>  
    </div>
	
</body>
</html>