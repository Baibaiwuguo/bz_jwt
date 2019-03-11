package com.wlxh.just.dao;

import com.wlxh.just.model.Repair;

import java.util.List;

public interface RepairMapper {

    List<Repair> selbycond(Repair repair);  //根据条件查询对应数据
    int insRepair(Repair repair);//插入数据

}