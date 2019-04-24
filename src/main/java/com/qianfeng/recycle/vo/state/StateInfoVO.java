package com.qianfeng.recycle.vo.state;

public class StateInfoVO {
    private String described;
    private Integer stateInfoId;
    private String describedInfo;

    public Integer getStateInfoId() {
        return stateInfoId;
    }

    public void setStateInfoId(Integer stateInfoId) {
        this.stateInfoId = stateInfoId;
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public String getDescribedInfo() {
        return describedInfo;
    }

    public void setDescribedInfo(String describedInfo) {
        this.describedInfo = describedInfo;
    }

    @Override
    public String toString() {
        return "StateInfoVO{" +
                "described='" + described + '\'' +
                ", stateInfoId=" + stateInfoId +
                ", describedInfo='" + describedInfo + '\'' +
                '}';
    }
}
