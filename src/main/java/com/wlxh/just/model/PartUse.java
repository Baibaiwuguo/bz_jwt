package com.wlxh.just.model;

import java.util.Date;

public class PartUse {
    private Integer id;

    private Integer repairId;

    private Integer partId;

    private Integer adminId;

    private Integer number;

    private Date createdAt;

    private Date updatedAt;

    private Admin admin;

    private Part part;

    private Object amdinId;

    public Object getAmdinId() {
        return amdinId;
    }

    public void setAmdinId(Object amdinId) {
        this.amdinId = amdinId;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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