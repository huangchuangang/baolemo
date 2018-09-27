package com.sie.full.model;

import java.util.Date;

public class Order {
    @Override
	public String toString() {
		return "Order [orderId=" + orderId + ", tableId=" + tableId + ", oderPrice=" + oderPrice + ", payStatus="
				+ payStatus + ", orderCreatetime=" + orderCreatetime + ", orderXxx=" + orderXxx + ", orderXxxx="
				+ orderXxxx + "]";
	}

	private Integer orderId;

    private Integer tableId;

    private Double oderPrice;

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

    public Double getOderPrice() {
        return oderPrice;
    }

    public void setOderPrice(Double oderPrice) {
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