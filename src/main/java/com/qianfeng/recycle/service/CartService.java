package com.qianfeng.recycle.service;

import com.qianfeng.recycle.po.TbCart;

import java.util.List;

public interface CartService {
    List<TbCart> selectCartsByUserId (Integer userId);

    void insertCartsByUserId(TbCart cart);

    void deleteCartsByUserId(Integer userId);
}
