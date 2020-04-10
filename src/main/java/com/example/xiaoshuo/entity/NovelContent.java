package com.example.xiaoshuo.entity;

import lombok.Data;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说信息表
 */
@Data
public class NovelContent extends BaseEntity{
    /**
     * 小说章节id
     */
    private Integer id;
    /**
     * 小说主表id
     */
    private Integer novelId;
    /**
     * 小说章节数
     */
    private String chapter;
    /**
     * 小说章节id
     */
    private Integer chapterId;
    /**
     * 小说章节名称
     */
    private String chapterName;
    /**
     * 小说章节内容
     */
    private String content;
}
