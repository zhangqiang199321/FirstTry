package com.example.xiaoshuo.service;

import com.example.xiaoshuo.entity.Novel;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说主表接口
 */
public interface INovelService {
    Novel getNovelbyName(String name);
}
