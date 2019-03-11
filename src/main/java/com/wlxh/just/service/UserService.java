package com.wlxh.just.service;

import com.wlxh.just.model.*;

import java.util.ArrayDeque;
import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/15 16:39
 */
public interface UserService {
    Admin detail(Admin admin);
    List<Location> getLocation();
    List<Repair> selrepair(Repair repair);  //根据对应条件查询数据
    List<Repair> selrepairall();
    List<Type> seltypeall(); //获取type表所有数据
    List<Location> seltypeandlocation(Type type);
    List<RepairUserDescription> seltypeanddescription(Type type);
    List<RepairAdminDescription> seladmindescription(RepairUserDescription repairUserDescription);
    int setnewrepair(Repair repair);//新增维修记录
    List<Location> seldistinctfirst();
}
