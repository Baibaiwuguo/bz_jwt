package com.wlxh.just.model;

import java.util.Date;

public class Repair {
    private Integer id;

    private Integer status;

    private Integer typeId;

    private String userId;

    private String userName;

    private String userMobile;

    private Integer locationId;

    private String userRoom;

    private Integer adminId;

    private String adminPicture;

    private Boolean userStar;

    private Date createdAt;

    private Date acceptedAt;

    private Date repairedAt;

    private Date completedAt;

    private Date updatedAt;

   private String[] statusall;

   private Type type;

   private Location location;

   private Admin admin;

   private Integer[] typeIds;

    private  String adminDescription;

    private  String userDescription;

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }



    public String getAdminDescription() {
        return adminDescription;
    }

    public void setAdminDescription(String adminDescription) {
        this.adminDescription = adminDescription;
    }

    public Integer[] getTypeIds() {
        return typeIds;
    }

    public void setTypeIds(Integer[] typeIds) {
        this.typeIds = typeIds;
    }

    public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Admin getAdmin() {
    return admin;
  }

  public void setAdmin(Admin admin) {
    this.admin = admin;
  }

  public String[] getStatusall() {
    return statusall;
  }

  public void setStatusall(String[] statusall) {
    this.statusall = statusall;
  }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getUserRoom() {
        return userRoom;
    }

    public void setUserRoom(String userRoom) {
        this.userRoom = userRoom == null ? null : userRoom.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminPicture() {
        return adminPicture;
    }

    public void setAdminPicture(String adminPicture) {
        this.adminPicture = adminPicture == null ? null : adminPicture.trim();
    }

    public Boolean getUserStar() {
        return userStar;
    }

    public void setUserStar(Boolean userStar) {
        this.userStar = userStar;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getAcceptedAt() {
        return acceptedAt;
    }

    public void setAcceptedAt(Date acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public Date getRepairedAt() {
        return repairedAt;
    }

    public void setRepairedAt(Date repairedAt) {
        this.repairedAt = repairedAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}