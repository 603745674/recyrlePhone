package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.state.ImgPriceVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ImgPriceMapper {
    ImgPriceVO queryEquByEquId(@Param("equId") Integer equId,@Param("stateInfoId") Integer stateInfoId);
}
