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
     <c:choose>
        <c:when test="${param.type=='NEW'}">
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-10">
                    <form:button id="saveBtn" name="saveBtn" class="btn btn-primary btn-large" value="save">
                        <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span>
                    </form:button>
                    <a class="btn btn-default" href="<c:url value="/"/>"><s:message code="cancel.label"/><span class="glyphicon glyphicon-erase"></span></a>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-10">
                    <form:button id="updateBtn" name="updateBtn" class="btn btn-primary btn-large" value="update">
                        <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span> <s:message code="update.label"/>
                    </form:button>
                    <a class="btn btn-danger" href="<c:url value="/localizacion/delete/${localizacion.id}"/>" onclick="return confirm('<s:message code="confirm.delete.message" />');" ><s:message code="delete.label"/> <span class="glyphicon glyphicon-trash"></span></a>
                    <a class="btn btn-default" href="<c:url value="/"/>"><s:message code="cancel.label"/> <span class="glyphicon glyphicon-erase"></span></a>
                </div>
            </div>
        </c:otherwise>
    </c:choose>
</form:form>