package com.chinasie.baoleme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chinasie.baoleme.dao.KindMapper;
import com.chinasie.baoleme.domain.Kind;

@RestController
public class HelloWordController {
	@Autowired
	KindMapper kindapper;
	
	@GetMapping("/kind/{id}")
	public Kind getKind(@PathVariable("id")Integer id) {
		return kindapper.selectByPrimaryKey(id);
		
	}
} 
