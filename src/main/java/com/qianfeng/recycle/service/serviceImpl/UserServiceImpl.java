package com.qianfeng.recycle.service.serviceImpl;


import com.qianfeng.recycle.commons.MD5Utils;
import com.qianfeng.recycle.commons.exception.PasswordErrorException;
import com.qianfeng.recycle.commons.exception.UsernameIsExistsException;
import com.qianfeng.recycle.commons.exception.UsernameNotFoundException;
import com.qianfeng.recycle.mapper.UserMapper;
import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.service.UserService;
import com.qianfeng.recycle.vo.UserLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(UserLoginVO userLoginVO)  throws Exception{
        if(userLoginVO == null){
            throw new NullPointerException("param is null");
        }
        String username=userLoginVO.getUsername();
        System.out.println(username);
        String password=userLoginVO.getPassword();
        if(null==username||"".equals(username)){
            throw new NullPointerException("username is null");
        }
        TbUser userInfo = userMapper.checkUserName(username);
        if(userInfo!=null){
            throw new UsernameIsExistsException();
        }
        String md5password = MD5Utils.md5(password,"LL");
        userMapper.insertUser(username,md5password);
    }

    @Override
    public TbUser login(UserLoginVO userLoginVO) throws Exception{
        if(userLoginVO == null){
            throw new NullPointerException("param is null");
        }
        String username=userLoginVO.getUsername();
        System.out.println(username);
        String password=userLoginVO.getPassword();
        if(null==username||"".equals(username)){
            throw new NullPointerException("username is null");
        }
        TbUser userInfo = userMapper.checkUserName(username);
        if(userInfo==null){
            throw new UsernameNotFoundException();
        }
        String md5password = MD5Utils.md5(password,"LL");
        System.out.println(md5password);
        if(!md5password.equals(userInfo.getPassword())){
            throw new PasswordErrorException("password is error");
        }
        return userInfo;
    }
}
