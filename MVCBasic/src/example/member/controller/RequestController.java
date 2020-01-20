package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.member.model.UserVO;

@Controller
@RequestMapping(value="/re")
public class RequestController {
	@RequestMapping(value= {"/a.do","/b.do"})
	public String test() {
		System.out.println("a.do 과 b.do 요청");
		return "re/a";
	}
	@RequestMapping(value= "/c.do",params= {"id=kim"})
	public void test2() {
		System.out.println("c.do 요청");
	}
	@RequestMapping(value= "/request.do",method=RequestMethod.POST)
	public void test3(@ModelAttribute("vo") UserVO vo) {
		System.out.println("request.do 요청");
		System.out.println("사용자명 : "+vo.getName());
		
	}
}
