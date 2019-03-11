package com.wlxh.just.service;

import com.wlxh.just.model.Admin;
import com.wlxh.just.model.Type;

import java.util.List;

/**
 * super  9  级别的接口
 * @author:baibaiwuchang
 * @Data:2019/2/15 14:37
 */
public interface SuperService {
    //创建用户
    int create(Admin admin);

    List<Admin> selbyadmin(Admin admin);

    int instype(Type type);

    int updadmin(Admin admin);

    Admin seladminbyid(Admin admin);

    Type seltype(Type type);

    int  updtype(Type type);

}
