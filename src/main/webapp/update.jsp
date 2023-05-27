<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="update1">

		ID:<input type="text" name="id"
			value="<%=request.getParameter("sid")%>" readonly="readonly"><br>
		NAME:<input type="text" name="name"
			value="<%=request.getParameter("name")%>"><br> 
	    NUMBER:<inputtype="text" name="number" value="<%=request.getParameter("phno")%>"><br>
		  <%if (request.getParameter("gender").equals("male")){ %>
        MALE<input type="radio" name="gender" value="male" checked="checked"><br>
		FEMALE:<input type="radio" name="gender" value="female"><br>
		          <%} else { %>
		MALE<input type="radio" name="gender" value="male" ><br>
		FEMALE:<input type="radio" name="gender" value="female" checked="checked"><br>       
		          
		          
		          <%} %>
		
		<button type="submit">UPDATE</button>
            

	</form>
</body>
</html>