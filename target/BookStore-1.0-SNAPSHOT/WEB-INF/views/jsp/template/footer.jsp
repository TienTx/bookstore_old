<%-- 
    Document   : footer
    Created on : Jun 29, 2016, 4:28:18 PM
    Author     : zOzDarKzOz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/image/thumb" var="thumb" />

        <footer class="clearfix">
            <section class="inside clearfix">
                <section class="bottom-cl">
                    <h1>BookStore</h1><br>
                    <a href=""><spring:message code="bs.aboutus"/></a><br>
                    <a href=""><spring:message code="bs.policy"/></a><br>
                    <a href=""><spring:message code="bs.contact"/></a>
                </section>
                <section class="bottom-cl">
                    <h2><spring:message code="bs.followus"/></h2>
                </section>
                <section class="bottom-cl">
                    <iframe src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FFacebookVietnam%2F&tabs=timeline&width=450&height=350&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId=834009886708645" 
                            width="350" height="255" style="border:none;overflow:hidden" 
                        scrolling="no" frameborder="0" allowTransparency="true">
                    </iframe>
                </section>
                <section class="bottom-cl">
                    <script src="https://apis.google.com/js/platform.js" async defer></script>
                    <div class="g-person" 
                         data-href="https://plus.google.com/109522526136549911327"
                         data-layout="portrait" data-width="225">
                    </div>
                </section>
            </section>
            <section class="inside clearfix">
                <a href="${pageContext.request.contextPath}/home.html">
                    <img alt="logo" src="${thumb}/logo.png">
                </a>
                <h2>${pageContext.request.contextPath} by tientx</h2>
            </section>
        </footer>
        <section id="back-to-top" title="Back to top">&uarr;</section>

        <spring:url value="/resources/core/js/jquery-2.2.4.min.js" var="jquery" />
        <spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
        <spring:url value="/resources/core/js/html5.js" var="html5" />
        <spring:url value="/resources/core/js/slick.min.js" var="slickJs" />
        <spring:url value="/resources/core/js/script.js" var="script" />
        <script src="${jquery}"></script>
        <script src="${bootstrapJs}"></script>
        <script src="${html5}"></script>
        <script src="${slickJs}"></script>
        <script src="${script}"></script>
    </body>
</html>
