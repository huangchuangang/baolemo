package com.sie.full.model;

import java.util.Date;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String menuImage;

    private Double menuPrice;

    private Integer kindId;

    private Date menuCreatetime;

    private Date menuUpdatetime;

    private String menuXxx;

    private String menuXxxx;

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

    public String getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage == null ? null : menuImage.trim();
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public Date getMenuCreatetime() {
        return menuCreatetime;
    }

    public void setMenuCreatetime(Date menuCreatetime) {
        this.menuCreatetime = menuCreatetime;
    }

    public Date getMenuUpdatetime() {
        return menuUpdatetime;
    }

    public void setMenuUpdatetime(Date menuUpdatetime) {
        this.menuUpdatetime = menuUpdatetime;
    }

    public String getMenuXxx() {
        return menuXxx;
    }

    public void setMenuXxx(String menuXxx) {
        this.menuXxx = menuXxx == null ? null : menuXxx.trim();
    }

    public String getMenuXxxx() {
        return menuXxxx;
    }

    public void setMenuXxxx(String menuXxxx) {
        this.menuXxxx = menuXxxx == null ? null : menuXxxx.trim();
    }
}