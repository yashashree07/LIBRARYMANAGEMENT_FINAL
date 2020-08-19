<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book added</title>
</head>
<body>
<h3>New Entry Created Successfully</h3>
<a href="index.jsp">All Books</a>
<%=request.getAttribute("name") %>

</body>
</html>