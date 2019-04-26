package com.qianfeng.recycle.po;


public class TbPrice {

  private long priceId;
  private java.sql.Timestamp priceTime;
  private long price;


  public long getPriceId() {
    return priceId;
  }

  public void setPriceId(long priceId) {
    this.priceId = priceId;
  }


  public java.sql.Timestamp getPriceTime() {
    return priceTime;
  }

  public void setPriceTime(java.sql.Timestamp priceTime) {
    this.priceTime = priceTime;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}
