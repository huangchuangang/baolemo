package com.chinasie.baoleme.dao;

import com.chinasie.baoleme.domain.Table;

public interface TableMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(Table record);

    int insertSelective(Table record);

    Table selectByPrimaryKey(Integer tableId);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}