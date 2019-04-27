package com.qianfeng.recycle.vo.state;

public class ImgPriceVO {
    private String img;
    private Integer price;
    private Integer equId;
    private Integer rate;
    private Integer num;
    private Integer stateInfoId;
    private Integer breakPrice;
    private String described;
    private String type;
    private Integer countPrice;

    public Integer getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(Integer countPrice) {
        this.countPrice = countPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getEquId() {
        return equId;
    }

    public void setEquId(Integer equId) {
        this.equId = equId;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStateInfoId() {
        return stateInfoId;
    }

    public void setStateInfoId(Integer stateInfoId) {
        this.stateInfoId = stateInfoId;
    }

    public Integer getBreakPrice() {
        return breakPrice;
    }

    public void setBreakPrice(Integer breakPrice) {
        this.breakPrice = breakPrice;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ImgPriceVO{" +
                "img='" + img + '\'' +
                ", price=" + price +
                ", equId=" + equId +
                ", rate=" + rate +
                ", num=" + num +
                ", stateInfoId=" + stateInfoId +
                ", breakPrice=" + breakPrice +
                ", described='" + described + '\'' +
                ", type='" + type + '\'' +
                ", countPrice=" + countPrice +
                '}';
    }
}
