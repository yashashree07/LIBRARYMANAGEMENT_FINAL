<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entry Form</title>
</head>
<body>
<h3>Entry Form</h3>

	<%
		Random rand = new Random();
		int n = rand.nextInt(1000);
		
	%>
		
	

<hr>
<html:form action="addnewbook" method="post">
	 
		<table>
			<tr>
				<td>Serial No</td>
				<td><html:text property="issue_serial_no" size="20" maxlength="20" /></td>
				
			</tr>
			
			<tr>
				<bean:message key="label.common.membercode"/>
				<td>Member Code</td>
				<td><html:text property="member_code" size="20" maxlength="20" /></td>
				<td><html:submit property="member" value="GetMember"><bean:message key="label.common.button.submit"/></html:submit></td>
			</tr> 
			<tr>
					<td>Name</td>
					<td><html:text property="name"></html:text></td>
			</tr>
			
			 <tr>
			 	<bean:message key="label.common.bookcode"/>
				<td>Book code</td>
				<td><html:text property="book_code" size="20" maxlength="20"/></td>
				<td><html:submit property="book" value="GetBook"><bean:message key="label.common.button.submit"/></html:submit></td>
			</tr>
			<tr>
				<td>title</td>
				<td><html:text property="title"></html:text></td>
				
			</tr>
			<tr>
				<td>author</td>
				<td><html:text property="author"></html:text></td>
				
			</tr>
			<tr>
				<td>Issue date</td>
				 <td><html:text property="issue_date" size="20" maxlength="20" /></td> 
				
			</tr>
			<tr>
				<td>Return date</td>
				<td><html:text property="return_date" size="20" maxlength="20" /></td>
			</tr> 
			<tr>
				<td></td>
				<td><html:submit property="issue" value="issueBook">Issue Book</html:submit></td>
				
			</tr>
		</table>
	</html:form>
	<div style="color:red">
		<html:errors/>
	</div>
</body>
</html>