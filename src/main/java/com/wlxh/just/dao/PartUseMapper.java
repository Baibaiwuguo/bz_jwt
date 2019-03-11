package com.wlxh.just.dao;


import com.wlxh.just.model.PartUse;

import java.util.List;

public interface PartUseMapper {
 int inspartuse(PartUse partUse);
 List<PartUse> selbypartuse(PartUse partUse);
}