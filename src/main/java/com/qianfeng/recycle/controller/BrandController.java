package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<TbBrand> selectAllBrand(){
        List<TbBrand> allBrand = brandService.selectAllBrand();
        return allBrand;
    }


}
