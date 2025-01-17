package com.example.lecture022;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("hello")
		public ResponseEntity<String> hello() {
			return ResponseEntity.ok("hihihihi");
	}
	
	@GetMapping("foo")
	public String foo() {
		return "Foo";
	}
	

}
