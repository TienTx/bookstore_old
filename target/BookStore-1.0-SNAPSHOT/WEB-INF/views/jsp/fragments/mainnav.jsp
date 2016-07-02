<%-- 
    Document   : mainnav
    Created on : Jul 1, 2016, 4:06:19 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <h1>Danh mục <a>&Delta;</a></h1>
    <c:if test="${!empty mapCategory}">
        <ul class="category">
            <c:forEach items="${mapCategory}" var="mapCategory">
                <li>
                    <h2>&nbsp; &raquo; ${mapCategory.key}</h2>
                    <ul class="subCt">
                        <c:forEach items="${mapCategory.value}" var="mapSubCategory">
                            <li>
                                <a href="${pageContext.request.contextPath}/${mapSubCategory.value.sLink}.html">
                                    ${mapSubCategory.value.sName}
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>
    </c:if>
</nav>
