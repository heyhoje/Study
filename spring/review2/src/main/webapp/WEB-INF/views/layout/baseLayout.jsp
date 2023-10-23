<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!doctype html>
<html>
<head>
	<title>
		<c:choose>
			<c:when test="${title}">${title}</c:when>
			<c:otherwise>스프링</c:otherwise>
		</c:choose>
	</title>
	<tiles:insertAttribute name="import"/>
</head>

<body>
    <tiles:insertAttribute name="header"/>
    <div class="container" style="min-height: calc(100vh - 56px - 224px)">        
        <tiles:insertAttribute name="body"/>
    </div>                                                  
    <tiles:insertAttribute name="footer" />
</body>
</html>