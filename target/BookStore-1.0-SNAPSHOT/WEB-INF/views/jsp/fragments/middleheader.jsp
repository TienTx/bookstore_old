<%-- 
    Document   : middleheader
    Created on : Jun 29, 2016, 4:50:37 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/image/thumb" var="thumb" />
<section class="inside clearfix">
    <section class="logo">
        <a href="<%=request.getContextPath()%>/home.html">
            <img alt="logo" src="${thumb}/logo.jpg">
        </a>
    </section>
    <section class="user-option">
        <span>&Xi; </span>
        <section class="option">
            <a href="<%=request.getContextPath()%>/login.html">Login</a><br>
            <a href="<%=request.getContextPath()%>/register.html">Register</a>
        </section>
    </section>
</section>