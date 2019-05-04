package com.qianfeng.recycle.service.serviceImpl;

import com.qianfeng.recycle.mapper.CartMapper;
import com.qianfeng.recycle.po.TbCart;
import com.qianfeng.recycle.service.CartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Override
    public List<TbCart> selectCartsByUserId(Integer userId) {
        List<TbCart> tbCarts = cartMapper.selectCartsByUserId(userId);
        return tbCarts;
    }

    @Override
    public void insertCartsByUserId(TbCart cart) {
        cartMapper.insertCartsByUserId(
                cart.getCartId(),
                cart.getUserId(),
                cart.getImg(),
                cart.getPrice(),
                cart.getEquId(),
                cart.getRate(),
                cart.getNum(),
                cart.getStateInfoId(),
                cart.getBreakPrice(),
                cart.getDescribed(),
                cart.getType(),
                cart.getCountPrice());
    }

    @Override
    public void deleteCartsByUserId(Integer userId) {
        cartMapper.deleteCartsByUserId(userId);
    }
}
