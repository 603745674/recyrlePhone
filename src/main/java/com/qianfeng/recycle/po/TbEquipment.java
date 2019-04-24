package com.qianfeng.recycle.po;


public class TbEquipment {

  private long equId;
  private long cartId;
  private long priceId;
  private long brandId;
  private String type;
  private String color;
  private String img;
  private String version;
  private String memory;
  private String versionInfo;


  public long getEquId() {
    return equId;
  }

  public void setEquId(long equId) {
    this.equId = equId;
  }


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public long getPriceId() {
    return priceId;
  }

  public void setPriceId(long priceId) {
    this.priceId = priceId;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }


  public String getVersionInfo() {
    return versionInfo;
  }

  public void setVersionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
  }

  @Override
  public String toString() {
    return "TbEquipment{" +
            "equId=" + equId +
            ", cartId=" + cartId +
            ", priceId=" + priceId +
            ", brandId=" + brandId +
            ", type='" + type + '\'' +
            ", color='" + color + '\'' +
            ", img='" + img + '\'' +
            ", version='" + version + '\'' +
            ", memory='" + memory + '\'' +
            ", versionInfo='" + versionInfo + '\'' +
            '}';
  }
}
