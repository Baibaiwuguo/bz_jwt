package com.wlxh.just.model;

import java.util.Date;

public class Part {
    private Integer id;

    private String name;

    private Integer number;

    private Date createdAt;

    private Date updatedAt;

    private PartAdd partAdd;


    public PartAdd getPartAdd() {
        return partAdd;
    }

    public void setPartAdd(PartAdd partAdd) {
        this.partAdd = partAdd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}