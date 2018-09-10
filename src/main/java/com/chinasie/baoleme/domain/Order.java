package com.chinasie.baoleme.domain;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer tableId;

    private Integer oderPrice;

    private Boolean payStatus;

    private Date orderCreatetime;

    private String orderXxx;

    private String orderXxxx;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getOderPrice() {
        return oderPrice;
    }

    public void setOderPrice(Integer oderPrice) {
        this.oderPrice = oderPrice;
    }

    public Boolean getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Boolean payStatus) {
        this.payStatus = payStatus;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public String getOrderXxx() {
        return orderXxx;
    }

    public void setOrderXxx(String orderXxx) {
        this.orderXxx = orderXxx == null ? null : orderXxx.trim();
    }

    public String getOrderXxxx() {
        return orderXxxx;
    }

    public void setOrderXxxx(String orderXxxx) {
        this.orderXxxx = orderXxxx == null ? null : orderXxxx.trim();
    }
}