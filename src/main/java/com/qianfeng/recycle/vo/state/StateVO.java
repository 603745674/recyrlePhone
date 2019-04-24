package com.qianfeng.recycle.vo.state;

import java.util.List;

public class StateVO {
    private Integer stateId;
    private String stateName;
    private Integer page;
    private List<StateInfoVO> stateInfoVOList;

    public Integer getStateId() {
        return stateId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<StateInfoVO> getStateInfoVOList() {
        return stateInfoVOList;
    }

    public void setStateInfoVOList(List<StateInfoVO> stateInfoVOList) {
        this.stateInfoVOList = stateInfoVOList;
    }

    @Override
    public String toString() {
        return "StateVO{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", page=" + page +
                ", stateInfoVOList=" + stateInfoVOList +
                '}';
    }
}
