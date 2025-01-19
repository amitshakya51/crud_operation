package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Service.UserService;
import com.example.demo.entity.UserDetails;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/savedetails")
	private String showsavepage(Model model) {
		String sql = "select gender from tbl_gender";
		List<Map<String, Object>> fetch=jdbcTemplate.queryForList(sql);
		model.addAttribute("fetch",fetch);
		return "saveData";
	}
	
	@PostMapping("/savedetails")
	private String savedetails(UserDetails userDetails,Model model) {
		UserDetails user=userService.saveDetail(userDetails);
		model.addAttribute("userDetails",user);
		model.addAttribute("msg","Saved sucessfully!!");
		return "redirect:/savedetails";
	}
	
	@GetMapping("/viewdetails")
	public String viewDetails(Model model) {
		List<Map<String, Object>> lists=userService.viewuser();
		model.addAttribute("userlist",lists);
		return "viewlist";
	}
	
	

}
