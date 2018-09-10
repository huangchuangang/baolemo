package com.chinasie.baoleme.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.chinasie.baoleme.domain.Kind;

public interface KindMapper {
    int deleteByPrimaryKey(Integer kindId);

    int insert(Kind record);

    int insertSelective(Kind record);

    Kind selectByPrimaryKey(Integer kindId);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
    
    //@Select("select kind_name,kind_createtime from t_kind where kind_id=#{id}")
    Kind selectById(Integer id);
    
    Kind getById(Integer id);
}