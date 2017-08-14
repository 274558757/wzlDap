package com.wzl.dap.service.impl;

import com.wzl.dap.mapper.SysUserMapper;
import com.wzl.dap.pojo.SysUser;
import com.wzl.dap.pojo.SysUserExample;
import com.wzl.dap.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/12 0012.
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SysUserMapper mapper;


    @Override
    public SysUser login(String loginName) throws Exception {
        return mapper.selectByUser(loginName);
    }
}
