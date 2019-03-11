package com.wlxh.just.dao;


import com.wlxh.just.model.Part;

import java.util.List;

public interface PartMapper {
    List<Part> getall(Part part);
    int insall(Part part);
    int updpart(Part part);

}