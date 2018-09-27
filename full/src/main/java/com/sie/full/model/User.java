package com.sie.full.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class User {
    private String userName;

    private String userPassword;

    private String userXxx;

    private String userXxxx;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserXxx() {
        return userXxx;
    }

    public void setUserXxx(String userXxx) {
        this.userXxx = userXxx == null ? null : userXxx.trim();
    }

    public String getUserXxxx() {
        return userXxxx;
    }

    public void setUserXxxx(String userXxxx) {
        this.userXxxx = userXxxx == null ? null : userXxxx.trim();
    }

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
    
}