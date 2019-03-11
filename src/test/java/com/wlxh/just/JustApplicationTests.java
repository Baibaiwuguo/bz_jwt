package com.wlxh.just;

import com.wlxh.just.dao.RepairMapper;
import com.wlxh.just.model.Repair;
import com.wlxh.just.utils.Edsutil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JustApplicationTests {

    @Autowired(required = false)
    private RepairMapper repairMapper;
    @Test
    public void contextLoads() {
        String user="111111";
        String pas= Edsutil.encryptBasedDes(user);
        System.out.println(pas);
        pas=Edsutil.decryptBasedDes(pas);
        System.out.println(pas);


    }
    @Test
    public void mybatistest()
    {
        /*AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andUsernameEqualTo()*/
        Repair repair=new Repair();
/*        String[] ar={};
        RepairExample repairExample =new RepairExample();
        RepairExample.Criteria criteria1=repairExample.createCriteria();
        criteria1.andTypeIdEqualTo(1);
        criteria1.andUserIdEqualTo("1");
        criteria1.andUserMobileEqualTo("1234");
        criteria1.andLocationIdEqualTo(1);
        criteria1.andUserRoomEqualTo("123");*/
        Integer[] s={1,2};
        repair.setTypeIds(s);
        repair.setUserId("1");
        repair.setUserMobile("1234");
        repair.setLocationId(1);
        repair.setUserRoom("123");
    repairMapper.selbycond(repair);

    }

}

