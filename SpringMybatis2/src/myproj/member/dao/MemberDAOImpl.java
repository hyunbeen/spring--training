package myproj.member.dao;

import java.sql.SQLException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myproj.member.dto.MemberVO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSessionTemplate ss;
	@Override
	public MemberVO idCheck(MemberVO vo) {
		MemberVO memberVo = null;
		try{
			memberVo = ss.selectOne("user.idCheck",vo);
		}catch( Exception ex )
		{
			System.out.println("MemberDAOImpl / idCheck 실패 : " + ex.getMessage());
		}
		return memberVo;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		int result = 0;
		try {
			result = ss.insert("user.userInsert",vo);
		} catch (Exception e) {
			System.out.println("MemberDAOImpl / memberInsert 실패 : " + e.getMessage());
		}
		return result;
	}

	@Override
	public MemberVO memberLogin(MemberVO vo) {
		MemberVO memberVo = null;
		try{
			memberVo = ss.selectOne("user.idCheck",vo);
		}catch( Exception ex )
		{
			System.out.println("MemberDAOImpl / idCheck 실패 : " + ex.getMessage());
		}
		return memberVo;
	}

}
