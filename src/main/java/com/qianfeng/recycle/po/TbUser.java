package com.qianfeng.recycle.po;


public class TbUser {

  private long userId;
  private long walletId;
  private String userName;
  private String password;
  private String mail;
  private String tel;
  private String address;
  private String paymentCode;
  private long level;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getWalletId() {
    return walletId;
  }

  public void setWalletId(long walletId) {
    this.walletId = walletId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPaymentCode() {
    return paymentCode;
  }

  public void setPaymentCode(String paymentCode) {
    this.paymentCode = paymentCode;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "TbUser{" +
            "userId=" + userId +
            ", walletId=" + walletId +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", mail='" + mail + '\'' +
            ", tel='" + tel + '\'' +
            ", address='" + address + '\'' +
            ", paymentCode='" + paymentCode + '\'' +
            ", level=" + level +
            '}';
  }
}
