package com.sie.full.model;

import java.util.Date;

public class Report {
    private Integer reportId;

    private Integer todayIncome;

    private Integer todayExpenditure;

    private Date incomeCreatetime;

    private Date incomeUpdatetime;

    private Date expenditureCreatetime;

    private Date expenditureUpdatetime;

    private String reportXxx;

    private String reportXxxx;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(Integer todayIncome) {
        this.todayIncome = todayIncome;
    }

    public Integer getTodayExpenditure() {
        return todayExpenditure;
    }

    public void setTodayExpenditure(Integer todayExpenditure) {
        this.todayExpenditure = todayExpenditure;
    }

    public Date getIncomeCreatetime() {
        return incomeCreatetime;
    }

    public void setIncomeCreatetime(Date incomeCreatetime) {
        this.incomeCreatetime = incomeCreatetime;
    }

    public Date getIncomeUpdatetime() {
        return incomeUpdatetime;
    }

    public void setIncomeUpdatetime(Date incomeUpdatetime) {
        this.incomeUpdatetime = incomeUpdatetime;
    }

    public Date getExpenditureCreatetime() {
        return expenditureCreatetime;
    }

    public void setExpenditureCreatetime(Date expenditureCreatetime) {
        this.expenditureCreatetime = expenditureCreatetime;
    }

    public Date getExpenditureUpdatetime() {
        return expenditureUpdatetime;
    }

    public void setExpenditureUpdatetime(Date expenditureUpdatetime) {
        this.expenditureUpdatetime = expenditureUpdatetime;
    }

    public String getReportXxx() {
        return reportXxx;
    }

    public void setReportXxx(String reportXxx) {
        this.reportXxx = reportXxx == null ? null : reportXxx.trim();
    }

    public String getReportXxxx() {
        return reportXxxx;
    }

    public void setReportXxxx(String reportXxxx) {
        this.reportXxxx = reportXxxx == null ? null : reportXxxx.trim();
    }
}