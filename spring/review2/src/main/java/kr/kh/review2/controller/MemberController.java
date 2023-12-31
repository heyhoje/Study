package kr.kh.review2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.review2.service.MemberService;
import kr.kh.review2.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/test")
	public String test() {
		MemberVO member = memberService.getMember("qwer123");
		System.out.println(member);
		return "redirect:/";
	}
}
