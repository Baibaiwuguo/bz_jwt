package com.wlxh.just.dao;


import com.wlxh.just.model.RepairAdminDescription;
import com.wlxh.just.model.RepairUserDescription;

import java.util.List;

public interface RepairAdminDescriptionMapper {
List<RepairAdminDescription> selByDescriptionId(RepairUserDescription repairUserDescription);
int insrad(RepairAdminDescription repairAdminDescription);
int updrad(RepairAdminDescription repairAdminDescription);
}