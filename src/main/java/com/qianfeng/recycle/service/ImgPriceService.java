package com.qianfeng.recycle.service;

import com.qianfeng.recycle.vo.state.ImgPriceVO;


public interface ImgPriceService {
    ImgPriceVO queryEquByEquId(Integer equId,Integer stateInfoId);

}
