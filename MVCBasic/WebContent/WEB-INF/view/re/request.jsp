<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
사용자명 : ${param.name}<br/>
age : ${param.age}<br/>
id : ${param.id}<br/>
<hr/>실제모델로 처리<hr/>
사용자명 : ${userVO.name}<br/>
age : ${userVO.age}<br/>
id : ${userVO.id}<br/>
<hr/>모델객체로 처리<hr/>
사용자명 : ${vo.name}<br/>
age : ${vo.age}<br/>
id : ${vo.id}<br/>
</body>
</html>