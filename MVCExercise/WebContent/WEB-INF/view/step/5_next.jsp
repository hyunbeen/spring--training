<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
     <% String prjName = "/MVCExercise";  %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> ����Ȯ�� </title>
</head>
<body>

${memVO.name } �� ������ ����Ǿ����ϴ�. <br/>

������ ���ǿ��� ��ü�� �����Ͽ� ���� ������������ ��µ��� �ʽ��ϴ�. <br/>

���� ���� : <%=session.getAttribute("memVO") != null ? "����" :"����" %>

</body>
</html>