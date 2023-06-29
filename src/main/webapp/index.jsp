<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Note Taker : Home Page</title>


<%@include file="all_js_css.jsp"%>

</head>
<body>
	<!-- include navbar -->
	<div class="container">
		<%@include file="navbar.jsp"%>

		<br>

		<div class=" card py-5">
			<img alt="" class=" mx-auto mb-4" src="img/sticky-notes.png" style="max-width: 280px">
			<h1 class="text-primary text-uppercase text-center mt-3">Start
				taking your notes</h1>
			
			<div class="container text-center my-3">
			<a href="add_notes.jsp"><button class="btn btn-outline-primary text-center">Start here</button>
			</a>
		</div>
	</div>
	
	<script>
		document.getElementById("homenav").classList.add("active");
	</script>
	
</body>
</html>