package kr.kh.edu1.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {

	String me_id;
	String me_pw;
	String me_email;
	String me_role;
	
	String me_session_id; 
	Date me_session_limit;
}
