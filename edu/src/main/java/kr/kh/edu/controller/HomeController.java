package kr.kh.edu.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.edu.vo.MemberVO;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, String id) {
		System.out.println("id : " + id);
		return "/main/home";
	}
	
	@GetMapping("/{id}")
	public String id(@PathVariable("id")String id2) {
		System.out.println("id2 : " + id2);
		
		return "redirect:/";
	}
	
	@GetMapping("/ajax/test")
	public String ajaxTest() {
		
		return "/main/ajax";
	}
	
	/** ajax test */
	@ResponseBody
	@PostMapping("/ajax/test1")//또는 @PostMapping("경로")
	public Map<String, Object> ajaxTest1(@RequestBody MemberVO member){
		Map<String, Object> map = new HashMap();
		System.out.println("test1 : " + member);
		
		map.put("member", member);
		return map;
	}
	
}
