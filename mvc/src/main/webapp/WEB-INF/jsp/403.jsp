<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<my:template>
<jsp:attribute name="body">

<div class="container">
    <div class="jumbotron">
        <h1><f:message key="error.access.denied.title"/></h1>
        <p><f:message key="error.access.denied.text"/></p>
    </div>
</div>
</jsp:attribute>
</my:template>
