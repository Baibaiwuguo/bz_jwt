package com.wlxh.just.dao;

import com.wlxh.just.model.Type;

import java.util.List;

public interface TypeMapper {
    List<Type> seltypeall();
    List<Type> selbytype(Type type);
    Type seltypebyid(Type type);
    int instype(Type type);
    int updtype(Type type);
}