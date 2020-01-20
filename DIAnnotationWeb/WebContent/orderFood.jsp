
<%@page import="cook.Order"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

ApplicationContext ctx = new GenericXmlApplicationContext("cook/order.xml"); 

Order order =  null;


String cate = request.getParameter("cmd");
if( cate == null )
	order = ctx.getBean("order1", Order.class);
else {
			if(  cate.equals("arabian")){
				order = ctx.getBean("order1", Order.class);
			}else if( cate.equals("indian")){
				order = ctx.getBean("order2", Order.class);
			}
}
%>
<%= order.menu() %>
</body>
</html>