<%-- 
    Document   : mainnav
    Created on : Jun 29, 2016, 5:04:03 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="clearfix">
    <section class="clearfix" id="navbar">
        <section class="inside clearfix">
            <%@include file="mainnav.jsp" %>
            <%@include file="search.jsp" %>
            <section class="cart">
                <span class="crt">VND</span>
                <span id="ttpr">10.000.000</span>
                <img alt="cart" title="cart" src="${icon}/cart.png">
                <span class="crt"><small>&nbsp;item(s)</small></span>
                <span id="amount">0</span>
            </section>
        </section>
    </section>
</section>