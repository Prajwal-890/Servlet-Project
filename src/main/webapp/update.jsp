<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
	id<input type="number" disabled="disabled" value="<%=request.getParameter("id")%>"><br>
	name<input type="text" value="<%=request.getParameter("name1")%>"><br>
	enter email:<input type="email" value="<%=request.getParameter("email")%>"><br>
	enter password:<input type="password" value="<%=request.getParameter("pwd")%>"><br>
	DOB:<input type="date" value="<%=request.getParameter("dob")%>"><br>
	male:<input type="radio"  name="gender" value="male">
	female:<input type="radio"  name="gender" value="female"><br>
	Accepetd T&C:<input type="checkbox"  name="checkbox" value="accepted"><br>
	Enter the Country: <select name="country">
		<option value="India">India</option>
		<option value="Austrilla">Austrilla</option>
		<option value="Nepal">Nepal</option>
		<option value="Bhutan">Bhutan</option>
	</select><br>
	<button type="submit">submit</button>
	<button type="reset">reset</button>
	</form>
</body>
</html>

