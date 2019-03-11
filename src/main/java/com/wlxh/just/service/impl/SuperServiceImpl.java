package com.wlxh.just.service.impl;

import com.wlxh.just.dao.AdminMapper;
import com.wlxh.just.dao.TypeMapper;
import com.wlxh.just.model.Admin;
import com.wlxh.just.model.Type;
import com.wlxh.just.service.SuperService;
import com.wlxh.just.utils.Edsutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/15 14:38
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class)
public class SuperServiceImpl  implements SuperService {

    @Autowired(required = false)
    private AdminMapper adminMapper;
    @Autowired(required = false)
    private TypeMapper typeMapper;
    @Override
    public int create(Admin admin) {
        admin.setPassword(Edsutil.encryptBasedDes(admin.getPassword()));
        List<Admin> lists=adminMapper.seladmin(admin);
        if (lists.size()==0)
        return adminMapper.insertSelective(admin);
        else
            return -1;
    }

    @Override
    public List<Admin> selbyadmin(Admin admin) {
        return adminMapper.seladmin(admin);
    }

    @Override
    public int instype(Type type) {
        return typeMapper.instype(type);
    }

    @Override
    public Type seltype(Type type) {
        return typeMapper.seltypebyid(type);
    }

    @Override
    public int updtype(Type type) {
        return typeMapper.updtype(type);
    }

    @Override
    public int updadmin(Admin admin) {
        return adminMapper.updAdmin(admin);
    }

    @Override
    public Admin seladminbyid(Admin admin) {
        return adminMapper.selectByPrimaryKey(admin.getId());
    }


}
