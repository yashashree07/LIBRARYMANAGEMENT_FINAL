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
<html:form >
		<table>
			<tr><td>Issue Serial No</td>
				<td><html:text property="issue_serial_no"></html:text>
			
			</tr>
			
			<tr><td><html:submit >submit</html:submit></td></tr>
			
		</table>
		
		
	</html:form>			
</body>
</html>