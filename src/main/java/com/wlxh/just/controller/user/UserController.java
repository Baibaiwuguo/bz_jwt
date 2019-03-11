package com.wlxh.just.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.wlxh.just.model.*;
import com.wlxh.just.service.UserService;
import jdk.nashorn.internal.scripts.JS;
import org.apache.ibatis.annotations.Param;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:40
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public  Object  test()
    {
        return "hello";
    }

    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    public Admin detail(@RequestBody Admin admin)
    {
        return userService.detail(admin);
    }

    @RequestMapping(value = "/getlocation",method = RequestMethod.POST)
    public Object getLocation()
    {
        return userService.getLocation();
    }

    @RequestMapping(value = "/seldistinctfirst",method = RequestMethod.POST)
    public JsonData seldistinctfirst()
    {
        return JsonData.buildSuccess(userService.seldistinctfirst(),"查询成功");
    }

    @RequestMapping(value = "/selrepair",method = RequestMethod.POST)
    public Object selrepair(@RequestBody Repair repair)
    {
       // System.out.println(repair.getUserName());
        System.out.println(repair.getTypeId());
        System.out.println(repair.getStatusall().length);
        return userService.selrepair(repair);
    }

    @RequestMapping(value = "/selrepairall",method = RequestMethod.POST)
    public Object selrepairall()
    {

        return userService.selrepairall();
    }

    /**
     * 获取所有type标的数据
     */
    @RequestMapping(value = "/seltypeall",method = RequestMethod.POST)
    public Object seltypeall()
    {
        return userService.seltypeall();
    }
    /**
     * 获取type对应的location数据
     */
    @RequestMapping(value = "/seltypeandlocation",method = RequestMethod.POST)
    public Object seltypeandlocation(@RequestBody Type type)
    {
        System.out.println(type.getId());
        return userService.seltypeandlocation(type);
    }

    /**
     * 获取type对应的description数据
     */
    @RequestMapping(value = "/seltypeanddescription",method = RequestMethod.POST)
    public JsonData seltypeanddescription(@RequestBody Type type)
    {
        return JsonData.buildSuccess(userService.seltypeanddescription(type),"获取成功！");
    }

    /**
     * 获取问题对应的解决办法
     */
    @RequestMapping(value = "/seladmindescription",method = RequestMethod.POST)
    public JsonData seladmindescription(@RequestBody RepairUserDescription repairUserDescription)
    {
        return JsonData.buildSuccess(userService.seladmindescription(repairUserDescription),"获取成功！");
    }
    /**
     * 新增维修记录
     */
    @RequestMapping(value = "/newrepair",method = RequestMethod.POST)
    public JsonData setnewrepair(@RequestBody Repair repair)
    {
        return JsonData.buildSuccess(userService.setnewrepair(repair),"新增报障单成功");
    }

}
