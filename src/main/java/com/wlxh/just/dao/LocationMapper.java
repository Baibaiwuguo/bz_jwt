package com.wlxh.just.dao;

import com.wlxh.just.model.Location;
import com.wlxh.just.model.Type;

import java.util.List;

public interface LocationMapper {
List<Location> selectBytypeId(Type type);
List<Location> seldistinctfirst(); //去重复first
    int inslocation(Location location);
}