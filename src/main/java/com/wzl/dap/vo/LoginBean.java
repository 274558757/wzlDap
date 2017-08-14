package com.wzl.dap.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
public class LoginBean implements Serializable{

    public String loginName;
    public String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public LoginBean() {
    }
}
