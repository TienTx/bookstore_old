<%-- 
    Document   : mainnav
    Created on : Jun 29, 2016, 5:04:03 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="clearfix">
    <section class="inside clearfix">
        <%@include file="mainnav.jsp" %>
        <section class="searchFrm">
            <form method="get" action="" name="searchFrm">
                <select name="sop">
                    <option value="0" selected="selected">&nbsp; All</option>
                    <c:if test="${!empty mapCategory}">
                        <c:forEach items="${mapCategory}" var="mapCategory">
                            <option disabled="disabled">&raquo; ${mapCategory.key}</option>
                            <c:forEach items="${mapCategory.value}" var="mapSubCategory">
                                <option value="${mapSubCategory.key}">${mapSubCategory.value.sName}</option>
                            </c:forEach>
                        </c:forEach>
                    </c:if>
                </select>
                <input type="text" name="svl" placeholder="All book you need ...">
                <input type="submit" value="" id="searchFrm">
            </form>
        </section>
        <section class="cart">
            cart
        </section>
    </section>
</section>
