package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.po.TbBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {
    List<TbBrand> selectAllBrand();
}
