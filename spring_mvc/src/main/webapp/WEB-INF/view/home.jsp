<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>


    <%
        String name = (String) request.getAttribute("name");
        Integer roll = (Integer) request.getAttribute("roll");
        /* List<String> list = (List<String>) request.getAttribute("listName"); */
    %>

    <h1>Home Page</h1>
    
    <a href="login"> move to login</a>
    <h6>
        Name:
        <%= name %>
    </h6>
    <h6>
        Roll Number:
        <%= roll %>
    </h6>
    
   <%--  <h6>
        Name Letters:
        <%
            if (list != null) {
                for (String listItem : list) {
        %>
            <%= listItem %> <br>
        <%
                }
            }
        %>
    </h6> --%>
</body>
</html>
