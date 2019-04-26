package com.qianfeng.recycle.controller;


import com.qianfeng.recycle.service.ImgPriceService;
import com.qianfeng.recycle.vo.state.ImgPriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("count")
public class CountController {
    @Autowired
    private ImgPriceService imgPriceService;
    private ImgPriceVO imgPriceVO=null;
    private List<ImgPriceVO> imgPriceVOList;
    @ResponseBody
    @RequestMapping(value = "/{infos}/{EquId}",method = RequestMethod.GET)
    public List<ImgPriceVO> acount(@PathVariable("infos") String infos , @PathVariable("EquId") Integer EquId){
        imgPriceVOList=new ArrayList<ImgPriceVO>();
        String[] ids = infos.split(",");
        Integer rate=0;
        Integer num=0;
        for(String id:ids){
            Integer stateInfoId = Integer.parseInt(id);
            if(stateInfoId!=0){
                imgPriceVO = imgPriceService.queryEquByEquId(EquId,stateInfoId);
                imgPriceVOList.add(imgPriceVO);
                num+=imgPriceVO.getNum();
                rate+=imgPriceVO.getRate();
            }
        }
        Integer price = imgPriceVO.getPrice()*(100-rate)/100-num;
        //System.out.println("num:"+num+"rate:"+rate+"折后价格:"+price);
        imgPriceVO.setBreakPrice(price);
        //System.out.println(imgPriceVO);
        return imgPriceVOList;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ImgPriceVO show(){
        return imgPriceVO;
    }

    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<ImgPriceVO>  showList(){
        return imgPriceVOList;
    }
}
