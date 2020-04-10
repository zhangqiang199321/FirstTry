package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.entity.UserInfo;
import com.example.xiaoshuo.service.IUserInfoService;
import com.example.xiaoshuo.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
//处理异步请求,可以用于Controller或者处理请求的方法上
//@CrossOrigin(origins = "http://localhost:9520", methods = RequestMethod.POST)
@Controller
@RequestMapping("/user/")
public class UserController {
    @Resource
    private IUserInfoService iUserInfoService;

    @RequestMapping("login")
    @ResponseBody
    public JsonResult login(UserInfo UserInfo) {
        Boolean login = iUserInfoService.login(UserInfo);
        if(login){
            return new JsonResult(1,"ok","登录成功");
        }else{
            return new JsonResult(1,"ok","登录失败");
        }
    }
    @RequestMapping("save")
    @ResponseBody
    public JsonResult saveUserInfo(UserInfo userInfo){
        Boolean aBoolean = iUserInfoService.saveUserInfo(userInfo);
        if(aBoolean){
            return new JsonResult(1,"ok","注册成功");
        }else{
            return new JsonResult(1,"ok","注册失败");
        }
    }
}
