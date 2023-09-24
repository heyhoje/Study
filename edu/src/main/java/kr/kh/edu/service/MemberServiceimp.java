package kr.kh.edu.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.edu.dao.MemberDAO;
import kr.kh.edu.vo.MemberVO;

@Service
public class MemberServiceimp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	
	// test
	@Override
	public MemberVO getMember(String id) {
		
		return memberDao.selectMember(id);
	}

	// 회원가입
	@Override
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}
		// 아이디 체크
		String regexId = "^[a-zA-Z]\\w{5,19}$";
		if(member.getMe_id() == null || Pattern.matches(regexId, member.getMe_id())){
			return false;
		}
		// 비번 체크
		String regexPw = "^\\w{6,20}$";
		if(member.getMe_pw() == null || Pattern.matches(regexPw, member.getMe_pw())) {
			return false;
		}
		return memberDao.insertMember(member);
	}
}
