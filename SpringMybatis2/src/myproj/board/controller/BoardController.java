package myproj.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public void list(Model model,String keyWord,String keyField) {
		if(keyWord==null) {
		List<BoardVO> listModel = boardDAO.list();
		model.addAttribute("listModel", listModel);
		}else {
			List<BoardVO> listModel = boardDAO.searchList(keyField, keyWord);	
			model.addAttribute("listModel", listModel);
		}
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
	@RequestMapping("/view.do")
	public void view(Model model,BoardVO vo) {
		BoardVO search = boardDAO.boardView(vo);
		model.addAttribute("model",search);
		//model
		
	}
	@RequestMapping("/edit.do")
	public void edit(Model model,BoardVO vo) {
		BoardVO search = boardDAO.boardEdit(vo);
		model.addAttribute("model",search);
	}
	@RequestMapping("/update.do")
	public ModelAndView editOk(BoardVO vo) {
		int result = boardDAO.boardEditOk(vo);
		String message = "수정이 실패 되었습니다";
		if(result>0) {
			message = "수정이 완료되었습니다";
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("/board/edit_ok");
		model.addObject("message",message);
		model.addObject("result",result);
		return model;
		
	}
	
	
}


