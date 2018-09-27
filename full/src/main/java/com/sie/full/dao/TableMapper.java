package com.sie.full.dao;

import com.sie.full.model.Table;

public interface TableMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(Table record);

    int insertSelective(Table record);

    Table selectByPrimaryKey(Integer tableId);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}