package com.wlxh.just.dao;

import com.wlxh.just.model.Admin;

import java.util.List;

public interface AdminMapper {
    List<Admin> seladmin(Admin admin);

    Admin selectByPrimaryKey(Integer id);

    int insertSelective(Admin admin);

    int updAdmin(Admin admin);
}