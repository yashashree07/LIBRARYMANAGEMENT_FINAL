<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books List</title>
</head>
<body>
	<h3>List Of All Books</h3>
	<hr>
	
	<table border="1">
		<tr>
			<th>Issue Serial No.</th>
			<th>Member Code</th>
			<th>Membername</th>
			<th>Book Code</th>
			<th>bookname</th>
			<th>Date of issue</th>
			<th>Date of return</th>
			
			
		</tr>
		<logic:iterate name="books" id="allbook">
			<tr>
				<td><bean:write name="allbook" property="issue_serial_no" /></td>
				<td><bean:write name="allbook" property="member.member_code" /></td>
				<td><bean:write name="allbook" property="member.name" /></td>
				<td><bean:write name="allbook" property="book.book_code" /></td>
				<td><bean:write name="allbook" property="book.title"/>
				<td><bean:write name="allbook" property="issue_date" /></td>
				<td><bean:write name="allbook" property="return_date" /></td>
				
				
				
			</tr>
		</logic:iterate>
		</table><br><br>
		<html:link action="newBook">New</html:link>
		<html:link action="updateBook">Update</html:link>
		<html:link action="deleteBook">Delete</html:link>
	<br><br>
	
	
</body>
</html>