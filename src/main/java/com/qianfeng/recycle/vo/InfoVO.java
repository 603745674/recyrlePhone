package com.qianfeng.recycle.vo;

public class InfoVO {
    private String brandName;
    private String type;
    private String img;
    private long price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InfoVO{" +
                "brandName='" + brandName + '\'' +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                '}';
    }
}
