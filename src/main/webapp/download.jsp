<%@page import="servlet_basic.dto.EmployeeDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>Dob</th>
			<th>checkbox</th>
			<th>country</th>
			<th>email</th>
			<th>gender</th>
			<th>name</th>
			<th>pwd</th>
			<th>delete</th>
			<th>update</th>
		</tr>
		<%
		List<EmployeeDto> emps = (List<EmployeeDto>) request.getAttribute("objects");
		%>
		<%
		for (EmployeeDto uv : emps) {
		%>
		<tr>
			<td><%=uv.getId()%></td>
			<td><%=uv.getDob()%></td>
			<td><%=uv.getCheckbox()%></td>
			<td><%=uv.getCountry()%></td>
			<td><%=uv.getEmail()%></td>
			<td><%=uv.getGender()%></td>
			<td><%=uv.getName()%></td>
			<td><%=uv.getPwd()%></td>
			<td><a href="deletebyid?id=<%=uv.getId()%>">remove</a></td>
			<td><a href="update.jsp?id=<%=uv.getId()%>&&dob<%=uv.getDob()%>&&email<%=uv.getEmail()%>&&name1<%=uv.getName()%>%%pwd<%=uv.getPwd()%>">Edit</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<div id="carouselExampleFade" class="carousel slide carousel-fade"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="https://rukminim1.flixcart.com/fk-p-flap/1600/270/image/b91142ce378acb54.jpg?q=20" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="https://rukminim1.flixcart.com/fk-p-flap/1600/270/image/2dc3aafcc8afbaf8.jpg?q=20" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="https://rukminim1.flixcart.com/fk-p-flap/1600/270/image/dd7f425c6a2fa49a.jpg?q=20" class="d-block w-100" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>