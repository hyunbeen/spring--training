package myproj.member.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import myproj.member.dao.MemberDAO;
import myproj.member.dto.MemberVO;

@Controller
@RequestMapping("/user")
public class MemberController {
	@RequestMapping("/{url}.do")
	public String test(@PathVariable String url) {
		return "/user/"+url;
	}
	@Autowired
	private MemberDAO memberDAO;
	
	@RequestMapping("/userInsert.do")
	public ModelAndView userInsert(MemberVO memberVO) {
		String message = "가입이되지 않았습니다";
		int result = memberDAO.memberInsert(memberVO);
		if(result > 0) {
			message = memberVO.getUserName() + "가입을 축하합니다";
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/userJoin_ok");
		mv.addObject("result", 1);
		mv.addObject("message", message);
		return mv;
	}
	@RequestMapping("/login.do")
	public String login(MemberVO memberVO,Model model,HttpSession session) {
		String message = "로그인을 다시 해주세요";
		int result = 0;
		MemberVO db_vo = memberDAO.memberLogin(memberVO);
		if(db_vo != null) {
			message = "로그인 성공";
			result = 1;
			session.setAttribute("sessionTime",(new Date()).toString());
			session.setAttribute("userName",db_vo.getUserId());
		}
		model.addAttribute("message", message);
		model.addAttribute("result", result);
		return "user/login_ok";
		
	}
	@RequestMapping("/idCheck.do")
	@ResponseBody //################## ajax인경우
	public String checkId(MemberVO memberVO) {
		String result = "ID값을 사용가능합니다.";
		MemberVO member = memberDAO.idCheck(memberVO);
		if(member!=null) {
			result = "이미 사용중인 아이디입니다.";
		}
		return result;
	}
}


