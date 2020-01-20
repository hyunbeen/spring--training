<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="./js/jquery-1.7.1.js"></script>
<script type="text/javascript">

		 //아이디 중복체크
	    function idDuplicateCheck(){
	        // 로그인 프로세스 호출
	        $.ajax({
	            type: 'post',
	            async: true,
	            //url:'${pageContext.request.contextPath}/login_chk.do',
	            url:'idCheck.do',
	            contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	            data:  ( {  userId : $("#userId").val() }),	           
	            success:function(resultData){
	            	//alert("resultData = "+resultData)
	            	// @ResponseBody로 넘겨 받는 때 한글이 깨지기 때문에 설정이 필요
	    			$('#idCheckResult').html(resultData);	            	
	    		}
	        });
		 }

</script>
</head>
<body>
	<form action="member/insert.do" method="post">
		<table cellspacing="0" width="600">
			<caption>
				<h2> 회원가입 </h2>
			</caption>
			<tr>
				<td width="200">아이디</td>
				<td><input type="text" name="id" id='userId'  onkeyup="idDuplicateCheck()"> <span id="idCheckResult" style="width:150px;color:red"></span></td>
			<tr>				
				<td width="200">비밀번호</td>
				<td><input type="text" name="pass" ></td>
			</tr>
			<tr>	
				<td width="200">이름</td>
				<td><input type="text" name="name" ></td>				
			</tr>
			<tr>
				<td width="100">나이</td>			
				<td><input type="text" name="age" ></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="전송"></td>
			</tr>

		</table>

	</form>


</body>
</html>