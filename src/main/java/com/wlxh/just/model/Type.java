package com.wlxh.just.model;

import java.util.Date;

public class Type {
    private Integer id;

    private String name;

    private Integer autoCompleteHours;

    private Integer autoCompleteStars;

    private Integer allowUserCreate;

    private Integer needUserInfo;

    private Date createdAt;

    private Date updatedAt;

    private String firstlocation;

    public String getFirstlocation() {
        return firstlocation;
    }

    public void setFirstlocation(String firstlocation) {
        this.firstlocation = firstlocation;
    }

    private RepairUserDescription repairUserDescription;

    public RepairUserDescription getRepairUserDescription() {
        return repairUserDescription;
    }

    public void setRepairUserDescription(RepairUserDescription repairUserDescription) {
        this.repairUserDescription = repairUserDescription;
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

    public Integer getAutoCompleteHours() {
        return autoCompleteHours;
    }

    public void setAutoCompleteHours(Integer autoCompleteHours) {
        this.autoCompleteHours = autoCompleteHours;
    }

    public Integer getAutoCompleteStars() {
        return autoCompleteStars;
    }

    public void setAutoCompleteStars(Integer autoCompleteStars) {
        this.autoCompleteStars = autoCompleteStars;
    }

    public Integer getAllowUserCreate() {
        return allowUserCreate;
    }

    public void setAllowUserCreate(Integer allowUserCreate) {
        this.allowUserCreate = allowUserCreate;
    }

    public Integer getNeedUserInfo() {
        return needUserInfo;
    }

    public void setNeedUserInfo(Integer needUserInfo) {
        this.needUserInfo = needUserInfo;
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