package kr.kh.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.kh.edu.service.MemberService;
import kr.kh.edu.vo.MemberVO;

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
	
	@GetMapping("/member/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "회원가입시켜줘라~~");
		return "/member/signup";
	}
	
	@PostMapping("/member/signup")
	public String signupPost(MemberVO member, Model model) {
		// System.out.println(member);
		
		// 서비스에게 회원가입 해달라고함(무엇을 해야할지/해당 정보로 시키려는 일이 가능한지) 
		// => (일 하기위해 어떤 정보가 필요할지) 회원정보를 주면서 => '가입여부'를 알려달라고함
		// member.setMe_session_id(null) 추가적인 정보가공이 필요할 수도 있음
		boolean res = memberService.signup(member);
		if(res) {
			model.addAttribute("msg", "회원가입 성공!");
			model.addAttribute("url", "");
		}else {
			model.addAttribute("msg", "회원가입 실패!");
			model.addAttribute("url", "member/signup");
		}
		
		return "/main/message";
	}
}
