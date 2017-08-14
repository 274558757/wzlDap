package com.wzl.dap.controller;

import com.wzl.dap.pojo.SysUser;
import com.wzl.dap.service.LoginService;
import com.wzl.dap.vo.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @RequestMapping("/test")
    public String test(){

        System.out.println("测试成功----");
        return "";

    }

    public void test1(){

    }


    @RequestMapping("/userLogin")
    public String  login(LoginBean bean, Model model)throws  Exception{

        HashMap<String,String> map = new HashMap<String, String>();
        if (bean.getLoginName() != null){
            SysUser user = service.login(bean.getLoginName());
            if (user != null){
                if (bean.getPassword() != null && bean.getPassword().equals(user.getPassWord())){
                    map.put("msg","success");
                }else {
                    map.put("msg","密码错误");
                }
            }else {
                map.put("msg","用户名不存在");
            }
        }




        return "";

    }



}
