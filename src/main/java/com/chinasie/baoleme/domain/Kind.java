package com.chinasie.baoleme.domain;

import java.util.Date;

public class Kind {
    private Integer kindId;

    private String kindName;

    private Date kindCreatetime;

    private Date kindUpdatetime;

    private String kindXxx;

    private String kindXxxx;

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public Date getKindCreatetime() {
        return kindCreatetime;
    }

    public void setKindCreatetime(Date kindCreatetime) {
        this.kindCreatetime = kindCreatetime;
    }

    public Date getKindUpdatetime() {
        return kindUpdatetime;
    }

    public void setKindUpdatetime(Date kindUpdatetime) {
        this.kindUpdatetime = kindUpdatetime;
    }

    public String getKindXxx() {
        return kindXxx;
    }

    public void setKindXxx(String kindXxx) {
        this.kindXxx = kindXxx == null ? null : kindXxx.trim();
    }

    @Override
	public String toString() {
		return "Kind [kindId=" + kindId + ", kindName=" + kindName + ", kindCreatetime=" + kindCreatetime
				+ ", kindUpdatetime=" + kindUpdatetime + ", kindXxx=" + kindXxx + ", kindXxxx=" + kindXxxx + "]";
	}

	public String getKindXxxx() {
        return kindXxxx;
    }

    public void setKindXxxx(String kindXxxx) {
        this.kindXxxx = kindXxxx == null ? null : kindXxxx.trim();
    }
}