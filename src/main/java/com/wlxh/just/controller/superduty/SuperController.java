package com.wlxh.just.controller.superduty;

import com.wlxh.just.model.Admin;
import com.wlxh.just.model.JsonData;
import com.wlxh.just.model.Type;
import com.wlxh.just.service.SuperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:39
 */
@RestController
@RequestMapping("/api/v1/user/super")
public class SuperController {
    @Autowired
    private SuperService superService;
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public  Object  test()
    {
        return "hello";
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public JsonData create(@RequestBody Admin admin)
    {
        if (superService.create(admin)==-1)
        {
            return   JsonData.buildSuccess(-1,"添加用户名一样");
        }
        else
        {
            return JsonData.buildSuccess(0,"添加成功");
        }

    }

    @RequestMapping(value = "/selbyadmin",method = RequestMethod.POST)
    public JsonData slebyadmin(@RequestBody Admin admin)
    {
        return JsonData.buildSuccess(superService.selbyadmin(admin),"查询成功");
    }

    /**
     * 向type表添加
     * @param type
     * @return
     */
    @RequestMapping(value = "instype",method = RequestMethod.POST)
    public JsonData instype(@RequestBody Type type)
    {
        return JsonData.buildSuccess(superService.instype(type),"添加成功");
    }

    /**
     * 修改admin的信息
     * @param admin
     * @return
     */
    @RequestMapping(value = "/updadmin",method = RequestMethod.POST)
    public JsonData updadmin(@RequestBody Admin admin)
    {
        return JsonData.buildSuccess(superService.updadmin(admin),"更新成功");
    }

    @RequestMapping(value = "/seladminbyid",method = RequestMethod.POST)
    public JsonData seladminbyid(@RequestBody  Admin admin)
    {
        return JsonData.buildSuccess(superService.seladminbyid(admin),"获取成功");
    }

    @RequestMapping(value = "/seltypebyid",method = RequestMethod.POST)
    public JsonData seltypebyid(@RequestBody  Type  type)
    {
        return JsonData.buildSuccess(superService.seltype(type),"获取成功");
    }
    @RequestMapping(value = "/updtype",method = RequestMethod.POST)
    public JsonData updtype(@RequestBody Type type)
    {
        return JsonData.buildSuccess(superService.updtype(type),"更新成功");
    }




}