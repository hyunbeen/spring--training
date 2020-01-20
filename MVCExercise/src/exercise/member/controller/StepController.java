package exercise.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import exercise.member.model.MemberVO;

@Controller
@RequestMapping("/step")
@SessionAttributes("memVO")
public class StepController {
	
	@ModelAttribute("memVO")
	public MemberVO prepare() {
		return new MemberVO();
	}
	
	@RequestMapping("/{url}.do")
	public String step1(@PathVariable String url,@ModelAttribute("memVO") MemberVO memberVO) {
		return "step/5_"+url;
	}
	@RequestMapping("/saveMember.do")
	public String save(@ModelAttribute("memVO") MemberVO memberVO,SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		return "step/5_stepConfirm";
	}
	@RequestMapping("/next.do")
	public String next(@ModelAttribute("memVO") MemberVO memberVO) {
		return "step/5_next";
	}
}
