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
	<form action="<%=prjName %>/step/step2.do" method="post">
		<table cellspacing="0" width="600">
			<caption>
				<h2>   회원가입 2단계 </h2>
			</caption>
			<tr>
				<td width="200">이름</td>
				<td><input type="text" name="name" value='홍자'></td>
			<tr>				
				<td width="200">나이</td>
				<td><input type="text" name="age" value='25'></td>
			</tr>			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="전송"></td>
			</tr>

		</table>

	</form>


</body>
</html>