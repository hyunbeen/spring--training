package trans.scan.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import trans.vo.CustomerVO;

@Repository
public class CustomerDAO {
	@Autowired
	private SqlSessionTemplate ss;
	public void addCustomer(CustomerVO vo) {
		ss.insert("customer.addCustomer",vo);
	}
}
