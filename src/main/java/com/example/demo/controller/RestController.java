package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.UserService;
import com.example.demo.entity.UserDetails;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getrecords")
	public LinkedList<UserDetails> getdetails(){
		return userService.getusers();
	}
}
