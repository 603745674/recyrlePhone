package com.qianfeng.recycle.controller;


import com.qianfeng.recycle.po.TbEquipment;
import com.qianfeng.recycle.service.EquService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Equ")
public class EquController {
    @Autowired
    private EquService equService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<TbEquipment> queryAllEqu() {
        List<TbEquipment> tbEquipments = equService.queryAllEqu();
        return tbEquipments;
    }

    @ResponseBody
    @RequestMapping(value ="/{brandId}",method = RequestMethod.GET)
    public List<TbEquipment> queryEquByBrandId(@PathVariable("brandId") Integer brandId) {
        List<TbEquipment> tbEquipments = equService.queryEquByBrandId(brandId);
        return tbEquipments;
    }
}
