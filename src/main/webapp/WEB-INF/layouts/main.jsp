<%-- 
    Document   : main
    Created on : Oct 7, 2016, 11:43:54 AM
    Author     : LidiaE_18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s"   uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><sitemesh:write property="title"/></title>
    <link rel="stylesheet" href="<s:url value='/css/bootstrap.min.css'/>">

    </head>
    <body>
        <h1>Hello World HOME!</h1>
        <h2>Hola chavos CASA!</h2>
        <button type="button" class="btn btn-default">Default</button>
        <button type="button" class="btn btn-primary">Primary</button>
        <h2>Chale /KHE</h2>
        <div class="container">
            <sitemesh:write property='body'/>
        </div>
        <script src="<c:url value='/js/jquery.min.js'/>"</script><!--siempre va primero que bootstrap-->
        <script src="<c:url value='/js/bootstrap.min.js'/>"</script>
        <sitemesh:write property="content"/>
    </body>
</html>
