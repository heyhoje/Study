package kr.kh.review2.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.review2.vo.MemberVO;

public interface MemberDAO {

	MemberVO selectMember(@Param("id")String id);

}
