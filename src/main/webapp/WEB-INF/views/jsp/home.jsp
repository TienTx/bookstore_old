<%-- 
    Document   : home
    Created on : Jun 29, 2016, 4:44:30 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@include file="template/header.jsp" %>

<section class="container inside clearfix">
    <aside class="as-left"></aside>
    <section class="main-slide">
        slide sach noi bat
    </section>
    <section class="tab-container">
        <section class="tab-title">
            <h1 id="b-s">sach nhap</h1>
            <h1 id="b-i-m">sach trong thang</h1>
            <h1 id="b-i-w">sach trong tuan</h1>
            <h1 class="show-tab-title" id="b-n">sach moi</h1>
        </section>
        <section class="tab-content b-s">
            sach nhap
        </section>
        <section class="tab-content b-i-m">
            sach trong thang
        </section>
        <section class="tab-content b-i-w">
            sach trong tuan
        </section>
        <section class="tab-content b-n show-tab-content">
            sach moi
        </section>
    </section>
    <section class="sub-slide">
        co the ban quan tam
    </section>
</section>

<%@include file="template/footer.jsp" %>