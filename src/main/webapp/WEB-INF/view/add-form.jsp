<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Add Form</title>
</head>
<body>
<div align="right">
<button><a href="manageproducts">Back</a></button>
</div>
<div align="center">
<h1>Add Product</h1>
<form:form modelAttribute="product" action="addedProduct" method="GET">
Product Name:<form:input path="name"/><br><br>
Product Price:<form:input path="price"/><br><br>
Product Category:<form:input path="category"/><br><br><br>
<input type="submit" value="Add Product">
</form:form>
</div>
</body>
</html>
