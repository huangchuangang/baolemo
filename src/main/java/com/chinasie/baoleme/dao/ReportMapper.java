package com.chinasie.baoleme.dao;

import com.chinasie.baoleme.domain.Report;

public interface ReportMapper {
    int insert(Report record);

    int insertSelective(Report record);
}