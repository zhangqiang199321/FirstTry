package com.example.xiaoshuo.service;

import com.example.xiaoshuo.entity.UserInfo;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 会员信息接口
 */
public interface IUserInfoService {
    Boolean login(UserInfo userInfo);
    Boolean saveUserInfo(UserInfo userInfo);
}
