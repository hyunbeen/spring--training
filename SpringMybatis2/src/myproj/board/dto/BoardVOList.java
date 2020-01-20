package myproj.board.dto;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;



public class BoardVOList {
	private ArrayList<BoardVO> listModel;

	public ArrayList<BoardVO> getList() {
		return listModel;
	}

	public void setList(ArrayList<BoardVO> listModel) {
		this.listModel = listModel;
	}
}
	
	
