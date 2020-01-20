package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import myproj.board.dto.BoardVO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardManager {
	
	private static SqlSessionFactory sqlMapper;
	
	static{
		String resource = "mybatis/SqlMapConfig.xml";
		try{
		
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		}catch( IOException ex)
		{
			System.out.println("BoardManager fail : " + ex.getMessage());
		}
	}
	
	// 게시판 목록 가져오기
	public static List<BoardVO> getList(){
		
		return null;
	}
	
	// 게시물 입력하기
	public static int boardInsert(BoardVO vo){
		
		  SqlSession session = sqlMapper.openSession();
	         int result = session.insert("board.boardInsert", vo);
	         session.commit();
	         return result;   
	}
	
	public static BoardVO boardView( BoardVO vo){
		
		return null;
	}
	
}
