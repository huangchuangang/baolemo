package com.sie.full.model;

import java.util.Date;

public class Stock {
    private Integer stockId;

    private String stockName;

    private Double stockTotal;

    private Date stockCreatetime;

    private Date stockUpdatetime;

    private String stockXxx;

    private String stockXxxx;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Double getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(Double stockTotal) {
        this.stockTotal = stockTotal;
    }

    public Date getStockCreatetime() {
        return stockCreatetime;
    }

    public void setStockCreatetime(Date stockCreatetime) {
        this.stockCreatetime = stockCreatetime;
    }

    public Date getStockUpdatetime() {
        return stockUpdatetime;
    }

    public void setStockUpdatetime(Date stockUpdatetime) {
        this.stockUpdatetime = stockUpdatetime;
    }

    public String getStockXxx() {
        return stockXxx;
    }

    public void setStockXxx(String stockXxx) {
        this.stockXxx = stockXxx == null ? null : stockXxx.trim();
    }

    public String getStockXxxx() {
        return stockXxxx;
    }

    public void setStockXxxx(String stockXxxx) {
        this.stockXxxx = stockXxxx == null ? null : stockXxxx.trim();
    }
}