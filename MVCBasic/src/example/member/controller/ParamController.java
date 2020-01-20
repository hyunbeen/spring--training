package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	@RequestMapping("param.do")
	//@RequestParam(value="id")
	public void param(String id,@RequestParam(defaultValue="0")String age) {
		System.out.println(id+">"+Integer.parseInt(age));
	}
}
