<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
     <% String prjName = "/MVCExercise";  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> 저장확인 </title>
</head>
<body>

${memVO.name } 님 정보가 저장되었습니다. <br/>

하지만 세션에서 객체를 제거하여 다음 페이지에서는 출력되지 않습니다. <br/>

세션 여부 : <%=session.getAttribute("memVO") != null ? "존재" :"제거" %>

</body>
</html>