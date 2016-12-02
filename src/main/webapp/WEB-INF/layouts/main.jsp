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
       
      <nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
        <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-book" aria-hidden="true"></span>  Libro de Visitas</a>
    </div>
      <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="/LibroDeVisita/">Inicio</a></li>
      <li><a href="/LibroDeVisita/localizacion/new">Nuevo</a></li>
      <li><a href="/LibroDeVisita/localizacion/list">Lista</a></li>
    </ul>
  </div>
         
</nav>
            
        <div class="container">
            <sitemesh:write property='body'/>
        </div>
        <script src="<c:url value='/js/jquery.min.js'/>"</script><!--siempre va primero que bootstrap-->
        <script src="<c:url value='/js/bootstrap.min.js'/>"</script>
        <sitemesh:write property="content"/>
          
</body>
    
</html>
