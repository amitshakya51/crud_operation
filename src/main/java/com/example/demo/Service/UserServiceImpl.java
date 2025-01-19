package com.example.demo.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	public UserDetails saveDetail(UserDetails userDetails){
		return userRepository.save(userDetails);
	}
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public LinkedList<UserDetails> getusers() {
		//List<UserDetails> ulist= userRepository.findAll();
		//ArrayList<UserDetails> alist=(ArrayList<UserDetails>) userRepository.findAll();
		List<UserDetails> alist= userRepository.findAll();
		List<UserDetails> llist=userRepository.findAll();
		System.out.println(alist.toString());
		return new LinkedList(llist);
	}

	@Override
	public List<Map<String, Object>> viewuser() {
		String sql = "select * from user_details";
		return jdbcTemplate.queryForList(sql);
	}
}
