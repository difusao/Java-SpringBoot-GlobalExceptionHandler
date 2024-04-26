package com.difusao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.difusao.exception.UserNotFoundException;
import com.difusao.exception.UserException;

@RestController
@RequestMapping("/users")
public class UsersController {
	@GetMapping
	public ResponseEntity<Object> getUsers() {
		throw new UserNotFoundException("Não encontrado");
	}

	@GetMapping("/example1")
	public ResponseEntity<Object> getExample1() {
		throw new UserException("example1");
	}
	
	@GetMapping("/example2")
	public ResponseEntity<Object> getExample2() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			map.put("message", "ok");
			
			return new ResponseEntity<Object>(map, HttpStatus.resolve(200));
		} catch (Exception e) {
			map.put("message", e.getMessage());
			
			return new ResponseEntity<Object>(map, HttpStatus.resolve(500));
		}
	}
}