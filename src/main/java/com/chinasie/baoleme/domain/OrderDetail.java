package com.chinasie.baoleme.domain;

public class OrderDetail {
    private Integer id;

    private Integer orderId;

    private Integer menuId;

    private String menuName;

    private Integer menuPrice;

    private Integer menuAmount;

    private Integer menuTotal;

    private String orderRemark;

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

    public Integer getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Integer menuPrice) {
        this.menuPrice = menuPrice;
    }

    public Integer getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(Integer menuAmount) {
        this.menuAmount = menuAmount;
    }

    public Integer getMenuTotal() {
        return menuTotal;
    }

    public void setMenuTotal(Integer menuTotal) {
        this.menuTotal = menuTotal;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public String getOrderDetailXxxx() {
        return orderDetailXxxx;
    }

    public void setOrderDetailXxxx(String orderDetailXxxx) {
        this.orderDetailXxxx = orderDetailXxxx == null ? null : orderDetailXxxx.trim();
    }
}