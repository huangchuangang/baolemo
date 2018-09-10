package com.chinasie.baoleme.domain;

public class Table {
    private Integer tableId;

    private String tableName;

    private String tableXxx;

    private String tableXxxx;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableXxx() {
        return tableXxx;
    }

    public void setTableXxx(String tableXxx) {
        this.tableXxx = tableXxx == null ? null : tableXxx.trim();
    }

    public String getTableXxxx() {
        return tableXxxx;
    }

    public void setTableXxxx(String tableXxxx) {
        this.tableXxxx = tableXxxx == null ? null : tableXxxx.trim();
    }
}