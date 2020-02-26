<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head>
		<title>Employee | Management</title>
	
	</head>
	
	<body>
		<h1>Add New Employee</h1>
		
		
			<form:form action="${pageContext.request.contextPath}/save" modelAttribute="employee" method="post">
			
				FirstName:
				<form:input type="text" path="firstName"/>
				
				<br />
				LastName:
				<form:input type="text" path="lastName"/>
				
				<br />
				
				Email:
				<form:input type="email" path="email" />
				
				Phone-number:
				<form:input type="text" path="PhoneNumber" />
				
				
				<input type="submit" value="save">
			</form:form>
		
			
	<br /> <br />
	
	
	
	</body>

</html>