package com.qianfeng.recycle.service;

import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.vo.UserLoginVO;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    TbUser login(UserLoginVO userLoginVO) throws Exception;
    void insertUser(UserLoginVO userLoginVO) throws Exception;
}
