<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<%-- 	<link rel="stylesheet" href="<c:url vlaue="/resource/css/style.css"/>"> --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container" align="center">
	<h1>Home page</h1>
	<a href="register" class="btn-sm btn-danger">Register</a>
	<a href="google" class="btn-sm btn-warning">go to google</a>
	<a href="yahoo" class="btn-sm btn-primary">go to yahoo</a>
	<a href="load_image" class="btn-sm btn-dark">upload imaage</a>
	<div class="container">
		<form action="searchUrl" method="post">
			<div class="mb-3 m-5"> 
			<input type="text" class="form-control"
					 placeholder="http://www.url.com" name="keyword">
				<button type="submit" class="btn btn-info mt-5">Search</button>
			</div>
		</form>
	</div>
</body>
</html>