package com.wlxh.just.controller.admin;

import com.wlxh.just.model.*;
import com.wlxh.just.service.AdminService;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:35
 */
@RestController
@RequestMapping("/api/v1/user/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public  Object  test()
    {
        return "hello";
    }

    @RequestMapping(value = "/selpart",method = RequestMethod.POST)
    public JsonData selpart()
    {
        return JsonData.buildSuccess(adminService.selpart(),"获取成功");
    }

    @RequestMapping(value = "/addpart",method = RequestMethod.POST)
    public JsonData addpart(@RequestBody Part part)
    {
        return JsonData.buildSuccess(adminService.addpart(part),"添加成功");
    }
    /**
     * 获取用户信息
     */
    @RequestMapping(value = "/getadmin",method = RequestMethod.POST)
    public JsonData getadmin()
    {
        return JsonData.buildSuccess(adminService.getadmin(),"获取成功");
    }

    /**
     * 根据条件查询备件添加信息
     */

    @RequestMapping(value = "/selpartadd",method = RequestMethod.POST)
    public JsonData selbypartadd(@RequestBody PartAdd partAdd)
    {

        return JsonData.buildSuccess(adminService.selbypartadd(partAdd),"查询成功");
    }
    @RequestMapping(value = "/selpartuse",method = RequestMethod.POST)
    public JsonData selbypartuse(@RequestBody PartUse partAdd)
    {

        return JsonData.buildSuccess(adminService.selbypartuse(partAdd),"查询成功");
    }

    @RequestMapping(value = "/selbytype",method = RequestMethod.POST)
    public JsonData selbytype(@RequestBody RepairUserDescription repairUserDescription)
    {

        return JsonData.buildSuccess(adminService.selbytype(repairUserDescription),"查询成功");
    }

    @RequestMapping(value = "/updrud",method = RequestMethod.POST)
    public JsonData updrud(@RequestBody RepairUserDescription repairUserDescription)
    {
        return JsonData.buildSuccess(adminService.updrud(repairUserDescription),"修改成功");
    }

    @RequestMapping(value = "/insrad",method = RequestMethod.POST)
    public JsonData insrad(@RequestBody RepairAdminDescription repairAdminDescription)
    {
        return JsonData.buildSuccess(adminService.insrad(repairAdminDescription),"添加成功");
    }

    @RequestMapping(value = "/insrud",method = RequestMethod.POST)
    public JsonData insrud(@RequestBody RepairUserDescription repairUserDescription)
    {
        return JsonData.buildSuccess(adminService.insrud(repairUserDescription),"添加成功");
    }

    /**
     * 添加保障区域
     */

    @RequestMapping(value = "/inslocation",method = RequestMethod.POST)
    public JsonData inslocation(@RequestBody Location location)
    {
        return JsonData.buildSuccess(adminService.inslocation(location),"添加成功");
    }

    /**
     * 修改维修方法
     */
    @RequestMapping(value = "/updrad",method = RequestMethod.POST)
    public JsonData updrad(@RequestBody RepairAdminDescription repairAdminDescription)
    {
        return JsonData.buildSuccess(adminService.updrad(repairAdminDescription),"修改成功");
    }



}
