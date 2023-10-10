<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-5">

<h1 class="text-center">FILL THE PRODUCT DETAILS</h1>
<hr>
<form action="handlproduct" method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">Product Name</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Eneter product name" name="name">
  </div>
  
  
 
  <div class="form-group">
    <label for="price">Peice of product</label>
    <input multiple class="form-control" type="text" id="exampleFormControlSelect2" name ="price"
    placeholder="Enter product price"/>
      
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Product Description</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"   name ="description"
      placeholder="Enter the product description"></textarea>
  </div>
  
  <div class="container text-center">
  	<a href="home" class="btn btn-outline-danger">
  	Back
  	</a>
  <button type="submit" class="btn btn-primary">
  Add Data
  </button>
  </div>
</form>
</div>
</body>
</html>