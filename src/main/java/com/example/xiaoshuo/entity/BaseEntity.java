package com.example.xiaoshuo.entity;

import lombok.Data;

import java.util.Date;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 基础信息表
 */
@Data
public class BaseEntity {
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
