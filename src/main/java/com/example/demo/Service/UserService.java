package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;

@Service
public interface UserService {

	public UserDetails saveDetail(UserDetails userDetails);
}
