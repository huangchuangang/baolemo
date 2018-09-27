package com.sie.full.serice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sie.full.dao.UserMapper;
import com.sie.full.model.User;
import com.sie.full.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper usermapper;
	public User userLogin(User user){ 
		return usermapper.getNameByPsw(user);
//		if(o == null){
//			return "输入的账户或者密码不正确";
//		}else{
//			return "你输入的账号是" + (String) o;
//		}
	}

}
