package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.vo.InfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InfoMapper {
      InfoVO queryEquInfo(@Param("equId") Integer equId);
}
