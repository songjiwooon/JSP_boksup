<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>arithmatic</title>
</head>
<body>
<c:if test="${!empty param.begin && !empty param.end && !empty param.step}">
	<c:forEach var="i" begin="${param.begin }" end="${param.end }" step="${param.step }">
		${ i }
	</c:forEach>
</c:if>
</body>
</html>