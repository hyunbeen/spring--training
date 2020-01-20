package exercise.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import exercise.member.model.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/insert2.do")
	public String test(MemberVO vo) {
		return "member/2_memberView";
	}
}
