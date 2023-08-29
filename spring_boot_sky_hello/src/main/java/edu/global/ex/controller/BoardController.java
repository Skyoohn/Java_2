package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.global.ex.vo.GradeVO;
import edu.global.ex.vo.MemberVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	@GetMapping("/grade")
	public String grade(GradeVO gradeVO) {
		return "grade";
	}
	@GetMapping("/insert")
	public String insert() {
		return "board/insert";
	}
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	//http://localhost:8282/board/confirm?id=abcd
	//유저에서 보내는 정보 받아내기
	//1. HttpServeletRequest를 통하여 받아오기

	//	@GetMapping("/confirm")
//	public String confirm(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
//		return "board/confirm";
//	}
	
	//2.@RequestParam을 통해 받아오기
//	@GetMapping("/confirm")
//	public String confirm(@RequestParam("id") String id,
//			              @RequestParam("pw") String pw, Model model) {
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
//		
//		return "board/confirm";
//	}
	
	//3. command 객체를 이용하는 방법
	//내부동작
	//MemberVO memberVO = new MemberVO();
	//GradeVO gradeVO = new GradeVO();
	//memberVO.setID(request.getParameter("id"));
	//gradeVO.setKor(request.getParameter("kor"));
	//model.addAttribute("gradeVO",gradeVO);
	//default 생성자가 반드시 있어야 함
	@GetMapping("/confirm")
	public String confirm(MemberVO memberVO) {
		
		System.out.println(memberVO);
		
//		System.out.println(memberVO.getId());
//		System.out.println(memberVO.getPw());
		
//		없어도됨
//		model.addAttribute("memberVO",memberVO);

//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
		
		return "board/confirm";
	}
	
//	@PostMapping("/confirm")
//	public String confirmPost(HttpServletRequest request, Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		model.addAttribute("id",id);
//		model.addAttribute("pw",pw);
//		return "board/confirm";
//	}
	@RequestMapping(value = "/confirm", method= RequestMethod.POST)
	public String confirmPost2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		return "board/confirm";
	}
	@GetMapping("/delete")
	public String delete() {
		return "board/delete";
	}
	@GetMapping("/content")
	public String content(Model model) {
		model.addAttribute("id","1234");
		model.addAttribute("pw","abcd");
		
		model.addAttribute("name","홍길동");
		model.addAttribute("age",1234);
		return "board/content";
	}
	@GetMapping("/reply")
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
		
		return mv;
	}
	@RequestMapping(value = "/update", method= RequestMethod.POST)
	public String update() {
		return "board/update";
	}
}