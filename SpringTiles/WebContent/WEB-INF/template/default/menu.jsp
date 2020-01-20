<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="home.do" var="homeUrl" htmlEscape="true"/>
            <a href="${homeUrl}">첫번째메뉴</a>
        </li>
        <li>
            <spring:url value="about.do" var="aboutUrl" htmlEscape="true"/>
            <a href="${aboutUrl}">다음메뉴</a>
        </li>
    </ul>
</div>