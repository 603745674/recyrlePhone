package com.qianfeng.recycle.service.serviceImpl;

import com.qianfeng.recycle.mapper.ImgPriceMapper;
import com.qianfeng.recycle.service.ImgPriceService;
import com.qianfeng.recycle.vo.state.ImgPriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgPriceServiceImpl implements ImgPriceService {
    @Autowired
    private ImgPriceMapper imgPriceMapper;
    @Override
    public ImgPriceVO queryEquByEquId(Integer equId, Integer stateInfoId) {
        ImgPriceVO imgPriceVO = imgPriceMapper.queryEquByEquId(equId,stateInfoId);
        return imgPriceVO;

    }
}
