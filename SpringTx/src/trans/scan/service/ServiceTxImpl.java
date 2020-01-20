package trans.scan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import trans.scan.repository.CustomerDAO;
import trans.scan.repository.MemberDAO;
import trans.vo.CustomerVO;
import trans.vo.MemberVO;


@Service
public class ServiceTxImpl implements ServiceTx {
	@Autowired
	private CustomerDAO cdao;
	@Autowired
	private MemberDAO mdao;
	
	@Transactional
	@Override
	public void addAll(CustomerVO cvo, MemberVO mvo) {
		cdao.addCustomer(cvo);
		mdao.addMember(mvo);

	}

}
