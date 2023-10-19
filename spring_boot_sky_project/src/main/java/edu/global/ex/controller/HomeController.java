package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/user/userHome")
	public void userHome() {
		log.info("userhome() ..");
//		return "home";
	}
//	위와 같음
//	@GetMapping("/user/userHome")
//	public String userhome() {
////		return "/user/userHome";
//	}
	
	   @GetMapping("/admin/adminHome")
	   public void adminHome() {
	      log.info("adminHome ...");
	   }

}