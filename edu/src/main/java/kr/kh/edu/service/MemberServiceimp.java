package kr.kh.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.edu.dao.MemberDAO;

@Service
public class MemberServiceimp implements MemberService{

	@Autowired
	MemberDAO memberDao;
}
