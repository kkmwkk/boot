package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	private static final String TAG = "HttpControllerTest : ";
	
	@GetMapping("/http/get")
	public String getTest(Member m) {
		System.out.println(TAG + "getter ; " );
		return "get요청 : ";
	}
	
	@PostMapping("/http/post")
	public String postTest() {
		return "post요청";
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "put요청";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
	

}
