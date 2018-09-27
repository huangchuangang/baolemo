package com.sie.full.serice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sie.full.dao.UserMapper;
import com.sie.full.model.User;
import com.sie.full.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserMapper usermapper;
    @Override
    public User userLogin(User user) {
    	
    	return usermapper.getNameByPsw(user);
    }

}
