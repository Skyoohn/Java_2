package edu.global.ex.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import edu.global.ex.vo.CircleVO;


@Controller
@RequestMapping("/shape/*")
public class ShapeController {
	@GetMapping("/input_circle")
	public String input_circle() {
		return "input_circle";
	}
	@GetMapping("/circleArea")
	public String circleArea(CircleVO circleVO) {
		return "circle";
	}
}