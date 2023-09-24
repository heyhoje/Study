package kr.kh.edu.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.edu.vo.MemberVO;

public interface MemberDAO {
	// test
	MemberVO selectMember(@Param("id")String id);

	// 회원가입
	boolean insertMember(@Param("member")MemberVO member);

}
