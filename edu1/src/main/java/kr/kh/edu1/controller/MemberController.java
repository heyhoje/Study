package kr.kh.edu1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.kh.edu1.service.MemberService;
import kr.kh.edu1.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/member/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "회원가입 잘해라");
		return "/member/signup";
	}
	
	@PostMapping("/member/signup")
	public String signupPost(MemberVO member, Model model) {
		boolean res = memberService.signup(member);
		
		if(res) {
			model.addAttribute("msg", "회원가입에 성공했습니다");
			model.addAttribute("url", "");
		}else {
			model.addAttribute("msg", "회원가입에 실패했습니다");
			model.addAttribute("url", "member/signup");
		}
		return "/main/message";
	}
}
