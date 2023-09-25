package kr.kh.edu1.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.edu1.vo.MemberVO;

public interface MemberDAO {

	boolean insertMember(@Param("member")MemberVO member);

}
