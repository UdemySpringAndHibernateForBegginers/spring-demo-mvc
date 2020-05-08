<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
	<title>Student Confirmation Page</title>
</head>
<body>
<h2>Student Confirmation Page</h2>

<p>The student is confirmed: ${student.firstName} ${student.lastName}</p>
<p>First name: ${student.firstName}</p>
<p>Last name: ${student.lastName}</p>
<p>First country: ${student.firstCountry}</p>
<p>Second country: ${student.secondCountry}</p>

</body>
</html>
