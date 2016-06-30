<%-- 
    Document   : header
    Created on : Jun 29, 2016, 4:28:12 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources/image/thumb" var="logo" />
        <link rel="shortcut icon" href="${logo}/logo.jpg" type="image/jpg" />
        <title>${currentPage}</title>
        <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
        <spring:url value="/resources/core/css/style.css" var="styleCss" />
        <spring:url value="/resources/core/css/slick.css" var="slickCss" />
        <link href="${bootstrapCss}" rel="stylesheet" />
        <link href="${styleCss}" rel="stylesheet" />
        <link href="${slickCss}" rel="stylesheet" />
    </head>
    <body>
        <header class="clearfix">
            <%@include file="../fragments/topheader.jsp" %>
            <%@include file="../fragments/middleheader.jsp" %>
            <%@include file="../fragments/mainnav.jsp" %>
        </header>

