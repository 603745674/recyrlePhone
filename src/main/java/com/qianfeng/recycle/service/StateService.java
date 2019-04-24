package com.qianfeng.recycle.service;


import com.qianfeng.recycle.vo.state.StateVO;
import java.util.List;

public interface StateService {
    List<StateVO> queryAllstate(Integer equId);
}
