<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<p>Second country: ${student.favoriteLanguage}</p>
<p>Second country: ${student.secondaryLanguage}</p>
<p>Operating systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</p>

</body>
</html>
