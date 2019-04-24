package com.qianfeng.recycle.service.serviceImpl;

import com.qianfeng.recycle.mapper.InfoMapper;
import com.qianfeng.recycle.service.InfoService;
import com.qianfeng.recycle.vo.InfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;

    @Override
    public InfoVO queryEquInfo(Integer equId){
        InfoVO infoVO = infoMapper.queryEquInfo(equId);
        return infoVO;
    }
}
