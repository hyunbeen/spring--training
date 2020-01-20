package example.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value= "/login.do")
	public ModelAndView test(String id,String password,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		if((id.equals("babo"))&&(password.equals("1111"))) {
			session.setAttribute("id", id);
			mv.setViewName("complete");
			return mv;
		}else {
			mv.setViewName("../../login");
			return mv;
		}
		
		
	}
}
