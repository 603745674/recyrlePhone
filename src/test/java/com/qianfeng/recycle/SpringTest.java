package com.qianfeng.recycle;


import com.qianfeng.recycle.commons.MD5Utils;
import com.qianfeng.recycle.mapper.*;
import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.po.TbEquipment;
import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.vo.InfoVO;
import com.qianfeng.recycle.vo.state.ImgPriceVO;
import com.qianfeng.recycle.vo.state.StateVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private EquMapper equMapper;
    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private StateMapper stateMapper;
    @Autowired
    private ImgPriceMapper imgPriceMapper;
    @Autowired
    private UserMapper UserMapper;
    @Test
    public void testCase1(){
        List<TbBrand> allBrand = brandMapper.selectAllBrand();
        //allBrand.forEach((p)-> System.out.println(p));
        for(int i =0;i<allBrand.size();i++){
            System.out.println(allBrand.get(i));
        }
    }
    @Test
    public void testCase2(){
        List<TbEquipment> tbEquipments = equMapper.queryAllEqu();
        for(int i =0;i<tbEquipments.size();i++){
            System.out.println(tbEquipments.get(i));
        }
        System.out.println("----------------");
        List<TbEquipment> tbEquipments1 = equMapper.queryEquByBrandId(1);
        for(int i =0;i<tbEquipments1.size();i++){
            System.out.println(tbEquipments1.get(i));
        }

    }
    @Test
    public void testCase3(){
        InfoVO infoVO = infoMapper.queryEquInfo(1);
        System.out.println(infoVO);
    }
    @Test
    public void testCase4(){
        List<StateVO> stateVOS = stateMapper.queryAllstate(1);
        System.out.println(stateVOS);
        System.out.println(stateVOS.size());
    }
    @Test
    public void testCase5(){
        String s="14,18,2,0,7,0,9,0,5";
        String [] a = s.split(",");
       for(String b:a){
           System.out.println(b);
       }
    }

    @Test
    public void testCase6(){
        ImgPriceVO imgPriceVO = imgPriceMapper.queryEquByEquId(1,14);
        System.out.println(imgPriceVO);
    }
    @Test
    public void testCase7(){
        TbUser tbUser = UserMapper.checkUserName("罗罗");
        System.out.println(tbUser);
    }
    @Test
    public void testCase8(){
        String ll = MD5Utils.md5("123456", "LL");
        System.out.println(ll);
    }
    @Test
    public void testCase9(){

        UserMapper.insertUser("罗罗","100");
    }

    @Test
    public void testCase10(){
        String s =" ,0";
        String[] a =s.split(",");
        for (String b:a) {
            System.out.println(" ".equals(b));
            System.out.println(b);
        }
        System.out.println("长度:"+a.length);
    }
    @Test
    public void testCase11(){
       List<String> v = new ArrayList<>();
        System.out.println("长度:"+v.size());
    }
}
