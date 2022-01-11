package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class DemoController {

	@GetMapping
	public ResponseEntity<String> myDemo() {
		return ResponseEntity.ok("Hi I am here >>> IBM cloud deployment is going on...");
	}

	@RequestMapping("demo/{message}")
	public String welcome1(@PathVariable String message) {
		return message;
	}
}
