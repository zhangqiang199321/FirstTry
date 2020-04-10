package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 用户表
 */
@Data
public class PersonInfo extends BaseEntity{
    /**
     * 表id
     */
    private Integer id;
    /**
     * 会员信息id
     */
    private Integer userInfoId;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名字
     */
    private String personName;
    /**
     * 用户性别
     */
    private String gender;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 删除标记 0：不删除 1：删除
     */
    private Boolean delFlag;
}
