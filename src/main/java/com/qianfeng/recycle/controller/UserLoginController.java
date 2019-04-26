package com.qianfeng.recycle.controller;



import com.qianfeng.recycle.commons.exception.PasswordErrorException;
import com.qianfeng.recycle.commons.exception.UsernameIsExistsException;
import com.qianfeng.recycle.commons.exception.UsernameNotFoundException;
import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.service.UserService;
import com.qianfeng.recycle.vo.UserLoginVO;
import com.qianfeng.recycle.vo.state.JsonResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserLoginController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/userlogin")
    public JsonResultVO loginAjax(UserLoginVO userLoginVO, HttpSession session){
        JsonResultVO jsonResultVO = new JsonResultVO();
        try {
            TbUser userInfo = userService.login(userLoginVO);
            session.setAttribute("userInfo",userInfo);
            jsonResultVO.setCode(1);
            jsonResultVO.setMsg("登陆成功");
        } catch (NullPointerException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请输入用户名!!!");
        }catch (UsernameNotFoundException | PasswordErrorException e){
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("用户名或密码错误");
        } catch (Exception e){
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请联系管理员603745674");
        }
        return jsonResultVO;
    }
    @ResponseBody
    @PostMapping("/insertUser")
    public JsonResultVO insertAjax(UserLoginVO userLoginVO){
        JsonResultVO jsonResultVO = new JsonResultVO();
        try {
            userService.insertUser(userLoginVO);
            jsonResultVO.setCode(1);
            jsonResultVO.setMsg("注册成功");
        } catch (NullPointerException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请输入用户名!!!");
        }catch (UsernameIsExistsException e){
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("用户名已存在");
        } catch (Exception e){
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请联系管理员603745674");
        }
        return jsonResultVO;
    }
}
