package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.service.StateService;
import com.qianfeng.recycle.vo.state.StateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("state")
public class StateController {
    @Autowired
    private StateService stateService;
    @ResponseBody
    @RequestMapping(value = "/{equId}",method = RequestMethod.GET)
    public List<StateVO> queryAllstate1(@PathVariable("equId") Integer equId){
        return stateService.queryAllstate(equId);
    }
}
