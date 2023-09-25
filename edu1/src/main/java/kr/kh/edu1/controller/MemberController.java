package kr.kh.edu1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kh.edu1.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
}
