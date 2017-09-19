package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ssm.mapper.UserMapper;
import com.ssm.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:spring-base.xml"})
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public  void testSelectById(){
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(1L);
		System.out.println(selectByPrimaryKey);
		
	}
	@Test
	public  void testSelectall(){
		List<User> selectAll = userMapper.selectAll(0, 3);
		System.out.println(selectAll);
		
	}
}
