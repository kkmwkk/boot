package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// @Controller 와 @RestController의 차이
@Controller
public class TempControllerTest {
	
	// http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		// 파일리턴 기본경로 : src/main/resources/static
		return "/home.html";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// 파일리턴 기본경로 : src/main/resources/static
		return "test";
	}
}
