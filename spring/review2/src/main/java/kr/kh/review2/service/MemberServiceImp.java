package kr.kh.review2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.review2.dao.MemberDAO;
import kr.kh.review2.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;

	@Override
	public MemberVO getMember(String id) {
		
		return memberDao.selectMember(id);
	}

}
