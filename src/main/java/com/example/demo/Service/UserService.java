package com.example.demo.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;

@Service
public interface UserService {

	public UserDetails saveDetail(UserDetails userDetails);
	
	public LinkedList<UserDetails> getusers();
	
	public List<Map<String, Object>> viewuser();
}
