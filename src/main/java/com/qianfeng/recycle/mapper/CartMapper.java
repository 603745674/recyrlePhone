package com.qianfeng.recycle.mapper;

import com.qianfeng.recycle.po.TbCart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartMapper {
    List<TbCart> selectCartsByUserId (@Param("userId") Integer userId);

    void insertCartsByUserId(@Param("cartId") Integer cartId,
                             @Param("userId") Integer userId,
                             @Param("img") String img,
                             @Param("price") Integer price,
                             @Param("equId") Integer equId,
                             @Param("rate") Integer rate,
                             @Param("num") Integer num,
                             @Param("stateInfoId") Integer stateInfoId,
                             @Param("breakPrice") Integer breakPrice,
                             @Param("described") String described,
                             @Param("type") String type,
                             @Param("countPrice") Integer countPrice);

    void deleteCartsByUserId(@Param("userId") Integer userId);
}
