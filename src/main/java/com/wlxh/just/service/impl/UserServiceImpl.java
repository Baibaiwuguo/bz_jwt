package com.wlxh.just.service.impl;

import com.wlxh.just.dao.*;
import com.wlxh.just.model.*;
import com.wlxh.just.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/15 16:39
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private AdminMapper adminMapper;
    @Autowired(required = false)
    private LocationMapper locationMapper;
    @Autowired(required = false)
    private RepairMapper repairMapper;
    @Autowired(required = false)
    private TypeMapper typeMapper;
    @Autowired(required = false)
    private RepairUserDescriptionMapper repairUserDescriptionMapper;
    @Autowired(required = false)
    private RepairAdminDescriptionMapper repairAdminDescriptionMapper;
    @Override
    public Admin detail(Admin admin) {
        List<Admin> lists=adminMapper.seladmin(admin);
        if (lists.size()==0)
        {
            return null;
        }
        else {
            return lists.get(0);
        }
    }

    /**
     * 获取区域列表（二维）
     * @return
     */
    @Override
    public List<Location> getLocation() {
        List<Location> lists=locationMapper.selectBytypeId(null);
       return lists;
    }

    /**
     *根据对应条件查询对应表（repair）的数据
     * @return
     */
    @Override
    public List<Repair> selrepair(Repair repair) {
        String[] statusall=repair.getStatusall();
        Integer[] stas =new Integer[statusall.length];
        for (int i=0;i<statusall.length;i++)
        {
            if (statusall[i].equals("已删除"))
                stas[i]=0;
            if (statusall[i].equals("等待维修"))
                stas[i]=1;
            if (statusall[i].equals("正在维修"))
                stas[i]=2;
            if (statusall[i].equals("维修完成"))
                stas[i]=3;
            if (statusall[i].equals("评价完成"))
                stas[i]=4;

        }
      System.out.println("lol"+repair.getTypeId());
        if (repair.getTypeId()!=null) {
            if (repair.getTypeId() == 0)
                repair.setTypeId(null);
        }
        if (repair.getTypeId()==null)
        {
            System.out.println(repair.getTypeId());
        }
        repair.setTypeIds(stas);
       return repairMapper.selbycond(repair);
    }

    @Override
    public List<Repair> selrepairall() {
        Repair repair=null;
        return repairMapper.selbycond(repair);
    }

    @Override
    public List<Type> seltypeall() {
        List<Type> types=typeMapper.seltypeall();
        System.out.println(types);
        return types;
    }

    @Override

    public List<Location> seltypeandlocation(Type type) {
        List<Location> lists=locationMapper.selectBytypeId(type);
        return lists;
    }

    @Override

    public List<RepairUserDescription> seltypeanddescription(Type type) {
        return repairUserDescriptionMapper.selectBytypeId(type);
    }

    @Override

    public List<RepairAdminDescription> seladmindescription(RepairUserDescription repairUserDescription) {
        return repairAdminDescriptionMapper.selByDescriptionId(repairUserDescription);
    }

    @Override
    public int setnewrepair(Repair repair) {

       return repairMapper.insRepair(repair);
    }

    @Override
    public List<Location> seldistinctfirst() {
        return locationMapper.seldistinctfirst();
    }

}
