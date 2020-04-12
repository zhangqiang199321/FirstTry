package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.UserInfoDao;
import com.example.xiaoshuo.entity.UserInfo;
import com.example.xiaoshuo.service.IUserInfoService;
import com.example.xiaoshuo.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaomeng
 * @date 2020.1.3
 * 会员信息服务，处理会员信息
 */
@Service
public class UserInfoService implements IUserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public Boolean login(UserInfo user) {
        UserInfo userInfo = userInfoDao.selectOne(user.getUserId());
        if(userInfo == null ){
            return false;
        }
        String passWord = userInfo.getPassWord();
        String md5 = MD5Util.getMD5(user.getPassWord());
        if(passWord != md5){
            return false;
        }
        return true;
    }

    @Override
    public Boolean saveUserInfo(UserInfo userInfo) {
        UserInfo user = userInfoDao.selectOne(userInfo.getUserId());
        if(user != null){
            return false;
        }else{
            String md5 = MD5Util.getMD5(userInfo.getPassWord());
            userInfo.setPassWord(md5);
            Integer integer = userInfoDao.insertOne(userInfo);
            if(integer !=null && integer == 1){
                return true;
            }
            return false;
        }
    }
}
