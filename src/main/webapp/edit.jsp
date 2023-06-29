<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entities.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@include file="all_js_css.jsp"%>

</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>

		<h1>Edit your note</h1>
		<br>

		<%
		String noteid = request.getParameter("note_id").trim();
		Session s = FactoryProvider.getFactory().openSession();

		Note note = s.get(Note.class, noteid);
		
		%>

		<form action="UpdateServlet" method="post">
			<input value="<%= note.getId() %>" name="noteId" type="hidden"/>
			<div class="mb-3">
				<label for="title" class="form-label">Note title</label> <input
					name="title" required type="text" class="form-control" id="title"
					aria-describedby="emailHelp"
					value="<%= note.getTitle() %>"
					>
			</div>

			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea name="content" required id="content"
					placeholder="enter your content here" class="form-control"
					style="height: 250px"><%= note.getContent() %></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save your note</button>
			</div>


		</form>

	</div>

</body>
</html>