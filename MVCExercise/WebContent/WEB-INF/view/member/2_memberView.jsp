<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>

가입한 내용 <br/>
이름 : ${memberVO.name }<br/>
주소 : ${memberVO.address.sido } /  ${memberVO.address.gu } /  ${memberVO.address.dong } 
</body>
</html>