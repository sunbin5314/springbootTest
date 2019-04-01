package com.sunbin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbin.demo.bean.User;
import com.sunbin.demo.mapper.AdminMapper;

@RestController
public class Controller {
	@Autowired
	AdminMapper adminMapper;
	@GetMapping("/user/getUserById")
	public User getUserById(String uid) {
		User user = adminMapper.getUserById(uid);
		return user;
	}
	@RequestMapping("/getList")
	public List<User> getList(){
		List<User> list = adminMapper.findAll();
		return list;
	}
}
