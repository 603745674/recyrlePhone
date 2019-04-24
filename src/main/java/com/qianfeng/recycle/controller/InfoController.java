package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.mapper.InfoMapper;
import com.qianfeng.recycle.vo.InfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("info")
public class InfoController {
    @Autowired
    private InfoMapper infoMapper;
    @ResponseBody
    @RequestMapping(value = "/{equId}",method = RequestMethod.GET)
    public InfoVO queryEquInfo(@PathVariable("equId") Integer equId){
        InfoVO infoVO = infoMapper.queryEquInfo(equId);
        System.out.println(infoVO);
        return infoVO;
    }
}
