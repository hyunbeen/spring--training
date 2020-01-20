<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% String prjName = "/MVCExercise";  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>  회원가입 2단계 </title>
</head>
<body>
	<form action="<%=prjName %>/step/saveMember.do" method="post">
		<table cellspacing="0" width="600">
			<caption>
				<h2>   회원가입 저장단계 </h2>
			</caption>
			<tr>
				<td width="200">아이디</td>
				<td><input type="text" name="id" value='${memVO.id }'></td>
			<tr>				
				<td width="200">비밀번호</td>
				<td><input type="text" name="pass" value='${memVO.pass }'></td>
			</tr>		
			<tr>
				<td width="200">이름</td>
				<td><input type="text" name="name" value='${memVO.name }'></td>
			<tr>				
				<td width="200">나이</td>
				<td><input type="text" name="age" value='${memVO.age }'></td>
			</tr>			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="회원가입합니다"></td>
			</tr>

		</table>

	</form>


</body>
</html>