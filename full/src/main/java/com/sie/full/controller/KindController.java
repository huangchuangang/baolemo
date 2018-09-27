package com.sie.full.controller;

import java.util.Date;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sie.full.dao.KindMapper;
import com.sie.full.model.Kind;
import com.sie.full.service.KindService;

@RestController
public class KindController {
	
	@Autowired
	KindService kindService;
	
	//查找类目(通过类目Id)
//	@PostMapping("/kind/getOneKind")
	@RequestMapping(value ="/kind/getOneKind",method=RequestMethod.POST)
	public List<Kind> getOneKind(Kind kind){
		System.out.println(kind.getKindId());
		return kindService.selectByPrimary(kind);
	}
	
	//添加类目
	@PostMapping("/kind/addKind")
	public  void addKind(Kind kind){
//		kind.setKindCreatetime(kindCreatetime);
		System.out.println("创建菜品名"+kind.getKindName());
		kind.setKindCreatetime(new Date());
		kind.setKindUpdatetime(new Date());
		System.out.println(kind.getKindCreatetime());
		 kindService.insertSelective(kind);
	}
	
	//修改类目
	@PostMapping("/kind/update")
	public void updateKind(Kind kind){
		System.out.println(kind.getKindName());
		kind.setKindUpdatetime(new Date());
		System.out.println(kind.getKindUpdatetime());
		kindService.updateByPrimaryKeySelective(kind);
	}
	
	
	//删除类目
	@PostMapping("/kind/deleteKind")
	public void deleteKind(Kind kind){
		//kindservice.deleteByPrimaryKey(1);
		System.out.println("删除成功");
		System.out.println(kind.getKindId());
		kindService.deleteByPrimaryKey(kind.getKindId());
	}
	
	//显示所有类目
	@PostMapping("/kind/getAllKinds")
	public List<Kind> getAllKinds(){
		kindService.getAllKind();
		return kindService.getAllKind();
	}

}
