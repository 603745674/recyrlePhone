package com.qianfeng.recycle.service.serviceImpl;



import com.qianfeng.recycle.mapper.StateMapper;
import com.qianfeng.recycle.service.StateService;
import com.qianfeng.recycle.vo.state.StateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {
    @Autowired
    private StateMapper stateMapper;

    @Override
    public List<StateVO> queryAllstate(Integer equId) {
        List<StateVO> stateVOS = stateMapper.queryAllstate(equId);
        return stateVOS;
    }
}
