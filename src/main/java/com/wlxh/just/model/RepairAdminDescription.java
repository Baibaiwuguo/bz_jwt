package com.wlxh.just.model;

import java.util.Date;

public class RepairAdminDescription {
    private Integer id;

    private Integer repairUserDescriptionId;

    private Date createdAt;

    private Date updatedAt;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepairUserDescriptionId() {
        return repairUserDescriptionId;
    }

    public void setRepairUserDescriptionId(Integer repairUserDescriptionId) {
        this.repairUserDescriptionId = repairUserDescriptionId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}