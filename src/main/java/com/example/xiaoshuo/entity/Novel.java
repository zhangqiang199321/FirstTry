package com.example.xiaoshuo.entity;

import lombok.Data;

/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说主表
 */
@Data
public class Novel extends BaseEntity{
    /**
     * 表id
     */
    private Integer id;
    /**
     * 小说名字
     */
    private String novelName;
    /**
     * 小说作者
     */
    private String novelAuthor;
    /**
     * 小说类型
     */
    private String novelType;
    /**
     * 删除标记 0：不删除 1：删除
     */
    private Boolean delFlag;
}
