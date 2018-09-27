package com.sie.full.dao;

import com.sie.full.model.User;

public interface UserMapper {
	
	User getNameByPsw(User user);
	
    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}