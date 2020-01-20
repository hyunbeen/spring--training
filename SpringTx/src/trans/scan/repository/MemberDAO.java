package trans.scan.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import trans.vo.MemberVO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate ss;
	public void addMember(MemberVO vo) {
		ss.insert("member.addMember",vo);
	}
}
