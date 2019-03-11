package com.wlxh.just.model;


public class TypeLocationRelation {

  private Integer id;
  private Integer typeId;
  private Integer locationId;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
