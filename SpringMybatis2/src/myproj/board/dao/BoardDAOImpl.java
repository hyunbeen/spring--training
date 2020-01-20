package myproj.board.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import myproj.board.dto.BoardVO;
@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSessionTemplate ss;
	@Override
	public List<BoardVO> list() {
		List<BoardVO> list = ss.selectList("board.boardList");
		return list;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		int result = ss.insert("board.boardInsert",vo);
		return result;
	}

	@Override
	public List<BoardVO> searchList(String keyField, String keyWord) {
		HashMap hash = new HashMap();
		hash.put("searchname", keyField);
		hash.put("searchtext", keyWord);
		List<BoardVO> list = ss.selectList("board.boardSearch",hash);
		return list;
	}

	@Override
	public BoardVO boardView(BoardVO vo) {
		int result = ss.update("board.boardFind",vo);
		BoardVO view = ss.selectOne("board.boardView",vo);
		
	
		return view;
	}

	@Override
	public BoardVO boardEdit(BoardVO vo) {
		BoardVO view = ss.selectOne("board.boardView",vo);
		return view;
	}

	@Override
	public int boardEditOk(BoardVO vo) {
		int result = ss.update("board.boardUpdate",vo);
		return result;
	}
	

}
