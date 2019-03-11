package com.wlxh.just.service;

import com.wlxh.just.model.*;

import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:58
 */

public interface AdminService {
    List<Part> selpart(); //查看备件的信息
    int addpart(Part part);//添加维修备件
    List<Admin> getadmin();//获取用户信息
    List<PartAdd> selbypartadd(PartAdd partAdd); //根据条件查询备件添加信息
    List<PartUse> selbypartuse(PartUse partUse);
    List<RepairUserDescription> selbytype(RepairUserDescription repairUserDescription);
    int updrud(RepairUserDescription repairUserDescription);
    int insrad(RepairAdminDescription repairAdminDescription);
    int insrud(RepairUserDescription repairUserDescription);
    int inslocation(Location location); //添加保障区域
    int updrad(RepairAdminDescription repairAdminDescription);
}
