package kr.kh.edu.service;

import kr.kh.edu.vo.MemberVO;

public interface MemberService {
	// test
	MemberVO getMember(String id);

	// 회원가입
	boolean signup(MemberVO member);
	
}
