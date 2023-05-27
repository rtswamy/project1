<%@page import="java.util.List"%>
<%@page import="student.dto.StudentDto"%>
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
	List<StudentDto> l1 = (List<StudentDto>) request.getAttribute("student list");
	%>
	<table border="">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>GENDER</th>
			<th>PHONE NO</th>
			<th>DELETE</th>
			<th>UPDATE</th>




		</tr>
		<%
		for (StudentDto a : l1) {
		%>

		<tr>

			<td><%=a.getId()%></td>
			<td><%=a.getSname()%></td>
			<td><%=a.getGender()%></td>
			<td><%=a.getNum()%></td>
			<td><a href="delete?id=<%=a.getId()%>">DELETE</a></td>
			<td><a
				href="update.jsp?
sid=<%=a.getId()%>
&phno=<%=a.getNum()%>
&name=<%=a.getSname()%>
&gender=<%=a.getGender()%>

">UPDATE</a></td>


		</tr>
		<% }%>

	</table>

</body>
</html>