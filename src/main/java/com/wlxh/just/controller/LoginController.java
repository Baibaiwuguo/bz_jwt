package com.wlxh.just.controller;

import com.wlxh.just.model.Admin;
import com.wlxh.just.model.JsonData;
import com.wlxh.just.service.LoginService;
import com.wlxh.just.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:40
 */
@RestController
@RequestMapping("/api/v1")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(@RequestBody Admin user)
    {
        Admin admin=(Admin)loginService.login(user);
        if (admin!=null)
        {
            String token= JwtUtil.geneJsonWebToken(admin);
            return JsonData.buildSuccess(token,0);
        }
        return JsonData.buildError("登陆错误",2);
    }
}
