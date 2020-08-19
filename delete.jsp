<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete book</title>
</head>
<body>
	<h3>Delete Book</h3>
	<hr>
<html:form>
		<table>
			<tr>
			<td>Book Code</td>
			<td><html:text property="book_code"></html:text></td>
		
			</tr>
			<tr>
				<td>Member Code</td>
				<td><html:text property="member_code"></html:text></td>
				
			</tr> 
			
			
		</table>
		<html:submit >submit</html:submit>
		
	</html:form>			
</body>
</html>