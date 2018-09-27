package com.sie.full.dao;

import java.util.List;

import com.sie.full.model.Kind;

public interface KindMapper {	
	//删除类目
    int deleteByPrimaryKey(Integer kindId);

    //插入类目
    int insert(Kind record);

    int insertSelective(Kind record);

    //查找一个类目
    List<Kind> selectByPrimaryKey(Kind kind);
    
    //查询所有类目
     List<Kind> getAllKind();

    //修改类目
    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}