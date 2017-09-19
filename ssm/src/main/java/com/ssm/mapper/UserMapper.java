package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.User;

public interface UserMapper {

    User selectByPrimaryKey(Long id);
    
    List<User> selectAll(@Param("offset") int offset, @Param("limit") int limit);
}