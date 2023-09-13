<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer className = (Integer) request.getAttribute("class");
	/* List<String> list = (List<String>)request.getAttribute(""); */
	%>
	<h1>login page</h1>
	<h5>
		Name :
		<%=name%></h5>
	<h5>
		Class :
		<%=className%></h5> --%>
		
	<h5>Name: ${name}</h5>
	<h5>my list : </h5>
	<c:forEach items="${list}" var="n">
	<h5>${n }</h5>
	</c:forEach>
</body>
</html>