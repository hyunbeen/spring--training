package myproj.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import myproj.board.dao.BoardDAO;
import myproj.board.dto.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDAO boardDAO;
	
	@RequestMapping("/{url}.do")
	public String test(@PathVariable String url) {
		return "/board/"+url;
	}
	
	@RequestMapping("/list.do")
	public void list() {
		
	}
	@RequestMapping("/write.do")
	public void write() {
		
	}
	@RequestMapping("/write_ok.do")
	public void writeOk(BoardVO boardVO,Model model) {
		int result = boardDAO.boardInsert(boardVO); 
		String message = "삽입에 실패했습니다";
		if(result>0) {
			message = "삽입에 성공했습니다";
		}
		model.addAttribute("message", message);
		model.addAttribute("result", result);
		
	}
	
	
}


