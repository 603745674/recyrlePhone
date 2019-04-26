package com.qianfeng.recycle.mapper;


import com.qianfeng.recycle.po.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    TbUser checkUserName(@Param("userName") String userName);
    void insertUser(@Param("userName") String userName,@Param("password") String password);
}
