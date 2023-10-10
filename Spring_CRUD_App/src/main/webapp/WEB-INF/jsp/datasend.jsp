<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp" %>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <div class="continer mt-5">
   		<div class="row">
   		<div  class="col-md-12">
   		
   		
   					<h1 class="text-center mb-3"> WleCome To  Product App</h1>
   					<table class="table table-dark" class="text-center">
  <thead>
    <tr>
      <th scope="col">product id</th>
      <th scope="col">Product name</th>
      <th scope="col">product description</th>
      <th scope="col">Price</th>
      <th scope="col">Action </th >
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product }" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name }</td>
      <td>${p.description }</td>
      <td class="font-weight-bold">&#x20B9; ${p.price }</td>
      <td>
      	<a href="delete/${p.id }"><i class="fa-solid fa-trash-can text-danger" style="font-size:30px;"></i></a>
      	
      	<a href="update/${p.id }"><i class="fa-solid fa-pen-nib " style="font-size:30px;"></i></a>
      </td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>
   					
   	<div class="container text-center">
   	
   	<a href="add" class="btn btn-outline-success">Add Product </a>
   	
   	
   	</div>	
   		
   		</div>
   		</div>
   
   
   
   </div>
</body>
</html>