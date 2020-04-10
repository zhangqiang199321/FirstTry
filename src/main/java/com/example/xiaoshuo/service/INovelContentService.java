package com.example.xiaoshuo.service;

import com.example.xiaoshuo.entity.NovelContent;

import java.util.List;

/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说章节接口
 */
public interface INovelContentService {
    NovelContent getNovelContent(String novelName,Integer chapterId);
    List<NovelContent> getNovelContentList(String novelName);
}
