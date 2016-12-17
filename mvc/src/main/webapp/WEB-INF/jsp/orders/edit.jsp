<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<my:template titleMessageKey="title.order.new" activeNav="orderManagement">
<jsp:attribute name="body">
<div class="col-lg-12">
    <form:form id="${order.id}" method="post" modelAttribute="order"
               action="${pageContext.request.contextPath}/orders/save">
    <div class="form-group">
        <label for="tireId"><f:message key="label.tire.type"/></label>
        <form:select path="tire.id" cssClass="form-control" id="tireId">
            <form:options items="${tireList}"/>
        </form:select>
    </div>
    
    <div class="form-group">
        <label for="tireQuantity"><f:message key="label.count"/></label>
        <form:input path="tireQuantity" cssClass="form-control" id="tireQuantity" placeholder="1"/>
        <form:errors path="tireQuantity" cssClass="text-danger" />
    </div>
    
    <div class="form-group">
        <label for="address"><f:message key="label.address"/></label>
        <form:input path="address" cssClass="form-control" id="address" placeholder="Address"/>
        <form:errors path="address" cssClass="text-danger" />
    </div>

    <div class="form-group">
        <label for="phone"><f:message key="label.phone"/></label>
        <form:input path="phone" cssClass="form-control" id="phone" placeholder="Phone"/>
        <form:errors path="phone" cssClass="text-danger" />
    </div>
   
    <button type="submit" class="btn btn-default"><f:message key="button.submit"/></button>
    </form:form>
</div>
</jsp:attribute>
</my:template>
