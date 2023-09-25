package kr.kh.edu1.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.edu1.dao.MemberDAO;
import kr.kh.edu1.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;

	@Override
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}
		// 아이디 체크
		String regexId = "^[a-zA-Z]\\w{5,19}$";
		if(member.getMe_id() == null|| !Pattern.matches(regexId, member.getMe_id())){
			return false;
		}
		// 비밀번호 체크
		String regexPw = "^\\w{6,20}$";
		if(member.getMe_pw()== null|| !Pattern.matches(regexPw, member.getMe_pw())) {
			return false;
		}
		return memberDao.insertMember(member);
	}
}
