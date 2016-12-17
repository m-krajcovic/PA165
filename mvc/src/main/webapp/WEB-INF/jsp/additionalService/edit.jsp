<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<my:template titleMessageKey="${additionalService.id == null ? 'title.as.new' : 'title.as.edit'}" activeNav="as">
<jsp:attribute name="body">
<div class="container">
    <div class="col-md-6">
        <form:form id="${additionalService.id}" method="post" modelAttribute="additionalService"
                   action="${pageContext.request.contextPath}/additionalService/save">
        <form:hidden path="id"  style="display:none"/>
        <div class="form-group">
            <label for="name"><f:message key="label.name"/></label>
            <form:input path="name" cssClass="form-control" id="name" placeholder="Name"/>
        </div>
        <div class="form-group">
            <label for="description"><f:message key="label.description"/></label>
            <form:textarea path="description" cssClass="form-control" rows="3" id="description"
                           placeholder="Description"/>
        </div>
        <div class="form-group">
            <label for="price"><f:message key="label.price"/></label>
            <div class="input-group">
                <form:input path="price" cssClass="form-control" id="price" placeholder="Price"
                            aria-describedby="currency-addon"/>
                <span class="input-group-addon" id="currency-addon">Kc</span>
            </div>
        </div>
        <button type="submit" class="btn btn-default"><f:message key="button.submit"/></button>
        </form:form>
    </div>
</div>
</jsp:attribute>
</my:template>
