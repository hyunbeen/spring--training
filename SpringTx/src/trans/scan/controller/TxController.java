
package trans.scan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import trans.scan.service.ServiceTxImpl;
import trans.vo.CustomerVO;
import trans.vo.MemberVO;


@Controller
public class TxController {
	@Autowired
	private ServiceTxImpl service;
	@RequestMapping(value="/form.do")
	public String txForm(){
		return "form";
	}
	@RequestMapping(value="/transfer.do")
	public String txForm2(CustomerVO cvo , MemberVO mvo,Model model){
		service.addAll(cvo, mvo);
		model.addAttribute("msg","삽입이 완료되었습니다");
		return "result";
	}
	
}
