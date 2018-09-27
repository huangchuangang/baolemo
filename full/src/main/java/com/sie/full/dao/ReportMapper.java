package com.sie.full.dao;

import com.sie.full.model.Report;

public interface ReportMapper {
    int insert(Report record);

    int insertSelective(Report record);
}