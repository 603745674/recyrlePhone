package com.qianfeng.recycle.service;


import com.qianfeng.recycle.po.TbEquipment;

import java.util.List;

public interface EquService {
    List<TbEquipment> queryAllEqu();
    List<TbEquipment> queryEquByBrandId(Integer brandId);
}
