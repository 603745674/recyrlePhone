package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.po.TbEquipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquMapper {
    List<TbEquipment> queryAllEqu();
    List<TbEquipment> queryEquByBrandId(@Param("brandId") Integer brandId);
}
