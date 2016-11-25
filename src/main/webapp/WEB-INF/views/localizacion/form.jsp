<%-- 
    Document   : form
    Created on : Nov 24, 2016, 11:19:59 AM
    Author     : LidiaE_18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s"   uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:choose>
    <c:when test="${param.type=='NEW'}">
        <c:url var="action" value="/localizacion/create"/>
    </c:when>
    <c:otherwise>
        <c:url var="action" value="/localizacion/update"/>        
    </c:otherwise>
</c:choose>
<form:form modelAttribute="localizacion" method="post" action="${action}" class="form-horizontal" data-parsley-validate="">
    <form:errors path="*">
        <c:forEach items="${messages}" var="message">
            <div class="alert alert-danger alert-dismissible" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <span class="glyphicon glyphicon-alert"></span> <strong>${message}</strong>
            </div>
        </c:forEach>                        
    </form:errors>
<!--Check id,version,username-->
    <fieldset>
        <c:choose>
            <c:when test="${param.type=='NEW'}">
            </c:when>
            <c:otherwise>
                <form:hidden path="id" />
                <form:hidden path="version" />
            </c:otherwise>
        </c:choose>
        <s:bind path="localizacion.latitud">
            <div class="form-group">
                <label for="name" class="control-label col-xs-2">Latitud</label>    
                <div class="col-xs-5">
                    <form:input path="latitud" class="form-control" placeholder="Latitud"/>
                </div>                                
            </div>
        </s:bind>
         <s:bind path="localizacion.longitud">
            <div class="form-group">
                <label for="name" class="control-label col-xs-2">Longitud</label>    
                <div class="col-xs-5">
                    <form:input path="longitud" class="form-control" placeholder="Longitud"/>
                </div>                                
            </div>
        </s:bind> 
    </fieldset>
</form:form>