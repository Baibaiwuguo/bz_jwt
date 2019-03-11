package com.wlxh.just.service;

import com.wlxh.just.model.Admin;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/12 0:15
 */
public interface LoginService {
    Object login(Admin admin);
    Object loginout(String username);
}
