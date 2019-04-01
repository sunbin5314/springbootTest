package com.sunbin.demo.mapper;

import java.util.List;

import com.sunbin.demo.bean.User;

public interface AdminMapper {
	public User getUserById(String uid);

	public List<User> findAll();
}
