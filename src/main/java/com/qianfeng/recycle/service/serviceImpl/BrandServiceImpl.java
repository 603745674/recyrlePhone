package com.qianfeng.recycle.service.serviceImpl;

import com.qianfeng.recycle.mapper.BrandMapper;
import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<TbBrand> selectAllBrand() {
        List<TbBrand> allBrand = brandMapper.selectAllBrand();
        return allBrand;
    }
}
