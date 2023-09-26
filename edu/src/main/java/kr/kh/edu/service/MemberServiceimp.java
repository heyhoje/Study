package kr.kh.edu.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.edu.dao.MemberDAO;
import kr.kh.edu.vo.MemberVO;

@Service
public class MemberServiceimp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
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
		if(member.getMe_id() == null || !Pattern.matches(regexId, member.getMe_id())){
			return false;
		}
		// 비번 체크
		String regexPw = "^\\w{6,20}$";
		if(member.getMe_pw() == null || !Pattern.matches(regexPw, member.getMe_pw())) {
			return false;
		}
		
		// 비밀번호 암호화
		String encodePassword = passwordEncoder.encode(member.getMe_pw()); // 화면에서 입력받은 비밀번호 암호화해서
		member.setMe_pw(encodePassword); // 암호화된 비번으로 회원정보를 수정
		
		return memberDao.insertMember(member);
	}
}
