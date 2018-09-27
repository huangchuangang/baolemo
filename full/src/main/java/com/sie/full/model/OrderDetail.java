package com.sie.full.model;

public class OrderDetail {
    private Integer id;

    private Integer orderId;

    private Integer menuId;

    private String menuName;

    private Double menuPrice;

    private Integer menuAmount;

    private Double menuTotal;

    private String orderDetailXxx;

    private String orderDetailXxxx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public Integer getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(Integer menuAmount) {
        this.menuAmount = menuAmount;
    }

    public Double getMenuTotal() {
        return menuTotal;
    }

    public void setMenuTotal(Double menuTotal) {
        this.menuTotal = menuTotal;
    }

    public String getOrderDetailXxx() {
        return orderDetailXxx;
    }

    public void setOrderDetailXxx(String orderDetailXxx) {
        this.orderDetailXxx = orderDetailXxx == null ? null : orderDetailXxx.trim();
    }

    public String getOrderDetailXxxx() {
        return orderDetailXxxx;
    }

    public void setOrderDetailXxxx(String orderDetailXxxx) {
        this.orderDetailXxxx = orderDetailXxxx == null ? null : orderDetailXxxx.trim();
    }
}