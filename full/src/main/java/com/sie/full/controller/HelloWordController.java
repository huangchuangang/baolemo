package com.sie.full.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.sie.full.dao.KindMapper;
import com.sie.full.dao.UserMapper;
import com.sie.full.model.Kind;
import com.sie.full.model.User;
import com.sie.full.service.UserService;

@RestController
public class HelloWordController {
	@Autowired
	KindMapper kindapper;
	@Autowired 
	UserMapper usermapper;
//	@GetMapping("/kind/{id}")
//	public User getKind(@PathVariable("id")String id) {
//		//Kind kind=kindapper.selectByPrimaryKey(id);
//		User user=usermapper.selectByPrimaryKey(id);
//		
//		return user;
//		
//	}
	
	@Autowired
	UserService userservice;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject getUser(User user){
		JSONObject req = new JSONObject();
		System.out.println("username is:"+user.getUserName());
		System.out.println("usernamePassword is:"+user.getUserPassword());
		  if(userservice.userLogin(user) != null) {
			  req.put("code", "200");
			  req.put("msg", "登录成功");
		  }
		  else {
			  req.put("code", "500");
			  req.put("msg", "登录失败");
		  }
		  
		  return req;
	}
	

} 
