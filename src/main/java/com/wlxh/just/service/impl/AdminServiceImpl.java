package com.wlxh.just.service.impl;

import com.wlxh.just.dao.*;
import com.wlxh.just.model.*;
import com.wlxh.just.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:baibaiwuchang
 * @Data:2019/2/11 18:59
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = false,rollbackFor = Exception.class)
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private AdminMapper adminMapper;
    @Autowired(required = false)
    private PartMapper partMapper;
    @Autowired(required = false)
    private PartAddMapper partAddMapper;
    @Autowired(required = false)
    private PartUseMapper partUseMapper;
    @Autowired(required = false)
    private LocationMapper locationMapper;
    @Autowired(required = false)
    private RepairUserDescriptionMapper repairUserDescriptionMapper;
    @Autowired(required = false)
    private RepairAdminDescriptionMapper repairAdminDescriptionMapper;
    @Override
    public List<Part> selpart() {
        return partMapper.getall(null);
    }

    @Override
    public int addpart(Part part) {
        PartAdd partAdd=part.getPartAdd();
        if (part.getId()==null)
        {
          List<Part> parts=partMapper.getall(part);
          System.out.println(parts.size());
          if (parts.size()==0)
          {
               partAdd.setPartId(partMapper.insall(part));
          }
          else
          {
              Part part1=parts.get(0);
              part1.setNumber(part1.getNumber()+part.getNumber());
              partAdd.setPartId(partMapper.updpart(part1));
          }
        }
        else {
            partMapper.updpart(part);
        }
        return   partAddMapper.inspartadd(partAdd);
    }

    @Override
    public List<Admin> getadmin() {
       return adminMapper.seladmin(null);
    }

    @Override
    public List<PartAdd> selbypartadd(PartAdd partAdd) {
        return partAddMapper.selbypartadd(partAdd);
    }

    @Override
    public List<PartUse> selbypartuse(PartUse partUse) {
        return partUseMapper.selbypartuse(partUse);
    }

    @Override
    public List<RepairUserDescription> selbytype(RepairUserDescription repairUserDescription) {
     return   repairUserDescriptionMapper.selByid(repairUserDescription);
    }

    @Override
    public int updrud(RepairUserDescription repairUserDescription) {
        return repairUserDescriptionMapper.updpud(repairUserDescription);
    }

    @Override
    public int insrad(RepairAdminDescription repairAdminDescription) {
       return repairAdminDescriptionMapper.insrad(repairAdminDescription);
    }

    @Override
    public int insrud(RepairUserDescription repairUserDescription) {
        return repairUserDescriptionMapper.ins(repairUserDescription);
    }

    @Override
    public int inslocation(Location location) {
        return  locationMapper.inslocation(location);
    }

    @Override
    public int updrad(RepairAdminDescription repairAdminDescription) {
        return repairAdminDescriptionMapper.updrad(repairAdminDescription);
    }
}
