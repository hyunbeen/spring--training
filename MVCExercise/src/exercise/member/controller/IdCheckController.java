package exercise.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IdCheckController {
	@RequestMapping(value="idCheck.do")
	@ResponseBody //########################## 비동기 통신(ajax)
	public String idcheck(String userId) {
		String dbId="scott";
		String result = "사용 가능한 아이디입니다.";
		if(dbId.equals(userId))result="중복된 ID 입니다";
		return result;
	}
}
