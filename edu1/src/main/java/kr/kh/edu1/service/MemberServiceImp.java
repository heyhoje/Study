package kr.kh.edu1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.edu1.dao.MemberDAO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
}