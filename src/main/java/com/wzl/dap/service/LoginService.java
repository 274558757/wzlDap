package com.wzl.dap.service;

import com.wzl.dap.pojo.SysUser;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
public interface LoginService {


    public SysUser login(String loginName) throws Exception;
}
