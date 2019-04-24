package com.qianfeng.recycle;


import com.qianfeng.recycle.mapper.*;
import com.qianfeng.recycle.po.TbBrand;
import com.qianfeng.recycle.po.TbEquipment;
import com.qianfeng.recycle.vo.InfoVO;
import com.qianfeng.recycle.vo.state.StateVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    }
}
