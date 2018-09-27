package com.sie.full.service;

import java.util.List;

import com.sie.full.model.Kind;

public interface KindService {
	//查询一个类目
	 List<Kind> selectByPrimary(Kind kind);
	 
	 //查询显示所有类目
	 List<Kind> getAllKind();
	 
	 //增加(插入)类目
	 void insertSelective(Kind kind);
	 
	 //更新类目
	 void updateByPrimaryKeySelective(Kind kind);
	 
	 //删除类目
	 void deleteByPrimaryKey(Integer kindId);
}
