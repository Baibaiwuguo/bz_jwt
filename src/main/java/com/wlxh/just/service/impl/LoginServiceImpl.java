package com.wlxh.just.service.impl;

import com.wlxh.just.dao.AdminMapper;
import com.wlxh.just.model.Admin;
import com.wlxh.just.service.LoginService;
import com.wlxh.just.utils.Edsutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/12 0:15
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired(required = false)
    private AdminMapper adminMapper;
    @Override
    public Object login(Admin user) {
     /*   AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<Admin> admins=adminMapper.selectByExample(adminExample);*/
        List<Admin> admins=adminMapper.seladmin(user);
        if (admins.size()==0)
        {
            return null;
        }
        Admin admin=admins.get(0);
        user.setPassword(Edsutil.encryptBasedDes(user.getPassword()));
        if (admin.getPassword().equals(user.getPassword()))
        {
            return admin;
        }
        return null;
    }

    @Override
    public Object loginout(String username) {
        return null;
    }
}
