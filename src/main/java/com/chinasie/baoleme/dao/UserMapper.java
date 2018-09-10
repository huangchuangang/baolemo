package com.chinasie.baoleme.dao;

import com.chinasie.baoleme.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}