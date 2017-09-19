package com.ssm.service;

import com.ssm.model.User;

public interface UserService {
	
	User selectByPrimaryKey(Long id);
	
	
}
