package com.wzl.dap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
public class LoginController {


    @RequestMapping("/test")
    public String test(){

        System.out.println("测试成功----");
        return "";

    }


}
