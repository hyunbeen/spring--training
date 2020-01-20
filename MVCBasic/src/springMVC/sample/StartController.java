package springMVC.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StartController {
	@RequestMapping("/start.do")
	public ModelAndView start() {
		System.out.println("start.do 요청성공");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("start");
		mv.addObject("name","홍길동");
		mv.addObject("message","오늘도 행복합시다");
		return mv;
	}
	@RequestMapping("/partner.do")
	public ModelAndView partner() {
		System.out.println("partner.do 요청성공");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("partner");
		mv.addObject("jjak","설현");
		mv.addObject("halmal","헤헤헤헤헤헤");
		return mv;
	}
	@RequestMapping("/charm.do")
	public void charm(Model m) {//########### Model은 넘겨주는 객체
		System.out.println("charm.do 요청성공");
		//***********************
		//리턴형이 void인 경우에 요청명과 동일한 결과 파일을 찾음 : charm
		//뷰리졸버 등록 - /WEB-INF/view/ + charm + .jsp
		m.addAttribute("name","홍홍홍");
		m.addAttribute("message","맛점");
	}
	@RequestMapping("/charm2.do")
	public String charm2(Model m) {
		m.addAttribute("name","김김김");
		m.addAttribute("message","맛점");
		System.out.println("charm2.do 요청성공");
		//뷰리졸버 등록 - /WEB-INF/view/ + charm2 + .jsp
		return "charm";
		//****************
		//리턴형이 String 인경우 결과값리턴이 아니라 View 페이지 이름을 지정
	}
}
