<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="home.do" var="homeUrl" htmlEscape="true"/>
            <a href="${homeUrl}">ù��°�޴�</a>
        </li>
        <li>
            <spring:url value="about.do" var="aboutUrl" htmlEscape="true"/>
            <a href="${aboutUrl}">�����޴�</a>
        </li>
    </ul>
</div>