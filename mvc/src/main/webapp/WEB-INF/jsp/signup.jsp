<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<my:template titleMessageKey="title.registration">
<jsp:attribute name="body">
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <form:form method="post" modelAttribute="user" action="${pageContext.request.contextPath}/signup">
            <div class="form-group">
                <label for="email"><f:message key="label.email"/></label>
                <form:input path="email" cssClass="form-control" id="email" placeholder="Email"/>
                <form:errors path="email" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="name"><f:message key="label.name"/></label>
                <form:input path="name" cssClass="form-control" id="name" placeholder="Name"/>
                <form:errors path="name" cssClass="text-danger"/>
            </div>
            <div class="form-group">
                <label for="password"><f:message key="label.password"/></label>
                <form:password path="password" cssClass="form-control" id="password" placeholder="Password"/>
                <form:errors path="password" cssClass="text-danger"/>
            </div>
            <button type="submit" class="btn btn-default"><f:message key="button.register"/></button>
            </form:form>
        </div>
    </div>
</div>
</jsp:attribute>
</my:template>
