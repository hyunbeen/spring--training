package example.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import example.member.model.Member;

@Controller
public class AutoScanController {
	//@Autowired
	@Resource(name="m2")
	private Member member;
	
	@RequestMapping("/autoScan.do")
	public ModelAndView autoScan() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("01_autoScan");
		mv.addObject("member",member);
		
		return mv;
	}
}
