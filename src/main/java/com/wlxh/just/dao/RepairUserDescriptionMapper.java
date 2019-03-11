package com.wlxh.just.dao;

import com.wlxh.just.model.RepairUserDescription;
import com.wlxh.just.model.Type;

import java.util.List;

public interface RepairUserDescriptionMapper {
   List<RepairUserDescription> selectBytypeId(Type type);

   List<RepairUserDescription> selByid(RepairUserDescription repairUserDescription);

   int updpud(RepairUserDescription repairUserDescription);

   int ins(RepairUserDescription repairUserDescription);
}