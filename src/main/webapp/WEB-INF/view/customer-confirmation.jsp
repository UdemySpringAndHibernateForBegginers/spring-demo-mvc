<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
	<title>Customer Confirmation Page</title>
</head>
<body>
<h2>Customer Confirmation Page</h2>

<p>The customer is confirmed:</p>
<p>First name: ${customer.firstName}</p>
<p>Last name: ${customer.lastName}</p>
<p>Free passes: ${customer.freePasses}</p>

</body>
</html>
