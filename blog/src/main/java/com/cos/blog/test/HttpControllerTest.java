package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// @Controller  -> 파일로 리턴해줘. return "/test.jsp"

// @RestController -> "get요청" > get요청.jsp




@RestController 
public class HttpControllerTest {
	
//	private static final String TAG = "HttpControllerTest : ";

	// http://localhost:8080/blog/http/get
	@GetMapping("/http/get")
	public String getTest(Member m, int id, String username) {
		m.setId(id);
		m.setUsername(username);
		return "get요청" + m.getId() + m.getUsername();
	}
	
	@PostMapping("/http/post")
	public String postTest(Member m) {
		return "post요청 " + m.getId();
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
