package com.qianfeng.recycle.service.serviceImpl;

import com.qianfeng.recycle.mapper.EquMapper;
import com.qianfeng.recycle.po.TbEquipment;
import com.qianfeng.recycle.service.EquService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquServiceImpl implements EquService {
    @Autowired
    private EquMapper equMapper;
    @Override
    public List<TbEquipment> queryAllEqu() {
        List<TbEquipment> tbEquipments = equMapper.queryAllEqu();
        return tbEquipments;
    }

    @Override
    public List<TbEquipment> queryEquByBrandId(Integer brandId) {
        List<TbEquipment> tbEquipments = equMapper.queryEquByBrandId(brandId);
        return tbEquipments;
    }
}
