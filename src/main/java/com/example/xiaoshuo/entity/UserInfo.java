package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 会员表
 */
@Data
public class UserInfo extends BaseEntity{
    /**
     * 会员id
     */
    private Integer id;
    /**
     * 会员账号
     */
    private String userId;
    /**
     * 会员密码
     */
    private String passWord;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 会员余额
     */
    private Integer mark;
    /**
     * 删除标记 0：不删除 1：删除
     */
    private Boolean delFlag;
}
