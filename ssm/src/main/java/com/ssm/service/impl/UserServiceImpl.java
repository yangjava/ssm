package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	

	public User selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
