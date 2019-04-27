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
    private List<ImgPriceVO> imgPriceVOList = new ArrayList<ImgPriceVO>();
    private String described;
    private Integer countPrice=0;
    private Integer stateInfoId;
    @ResponseBody
    @RequestMapping(value = "/{infos}/{EquId}",method = RequestMethod.GET)
    public ImgPriceVO acount(@PathVariable("infos") String infos , @PathVariable("EquId") Integer EquId){
        System.out.println(infos);
        imgPriceVO=new ImgPriceVO();
        described="";
        Integer rate=0;
        Integer num=0;
        String[] ids = infos.split(",");
        for(String id:ids){
            stateInfoId = Integer.parseInt(id);
            if(stateInfoId!=0){
                imgPriceVO = imgPriceService.queryEquByEquId(EquId,stateInfoId);
                described+=imgPriceVO.getDescribed()+" ";
                num+=imgPriceVO.getNum();
                rate+=imgPriceVO.getRate();
            }
        }
        Integer price = imgPriceVO.getPrice()*(100-rate)/100-num;
        imgPriceVO.setBreakPrice(price);
        imgPriceVO.setDescribed(described);
        System.out.println("wanbi");
        return imgPriceVO;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ImgPriceVO show(){
        return imgPriceVO;
    }

    @ResponseBody
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public ImgPriceVO  addOrder(){

        return imgPriceVO;
    }

    @ResponseBody
    @RequestMapping(value = "/cart",method = RequestMethod.GET)
    public List<ImgPriceVO> addCart(){
        countPrice=0;
        imgPriceVOList.add(imgPriceVO);
        for (int i = 0; i <imgPriceVOList.size() ; i++) {
            countPrice+=imgPriceVOList.get(i).getBreakPrice();
        }
        imgPriceVOList.get(imgPriceVOList.size()-1).setCountPrice(countPrice);
        return imgPriceVOList;
    }

    @ResponseBody
    @RequestMapping(value = "/cartList",method = RequestMethod.GET)
    public List<ImgPriceVO> cartList(){

        return imgPriceVOList;
    }

}
