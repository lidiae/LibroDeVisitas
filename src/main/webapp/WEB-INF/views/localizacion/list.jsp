<%-- 
    Document   : list
    Created on : Dec 1, 2016, 1:09:28 PM
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
        <title>Lista Localizaciones</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                
                <table  id="localizacion" class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>latitud</th>
                            <th>longitud</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${localizacionList}" var="localizacion">
                            <tr>
                                <th>${localizacion.id}</th>                                
                                <th>${localizacion.latitud}</th>
                                <th>${localizacion.longitud}</th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div><!--/.row-->
        </div><!--/.container -->
    </body>
    <content>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#localizacion').DataTable();
            });
        </script>
    </content>
</html>
