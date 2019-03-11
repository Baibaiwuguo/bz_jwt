package com.wlxh.just.dao;


import com.wlxh.just.model.PartAdd;

import java.util.List;

public interface PartAddMapper {
    int inspartadd(PartAdd partAdd);
    List<PartAdd> selbypartadd(PartAdd partAdd);
}