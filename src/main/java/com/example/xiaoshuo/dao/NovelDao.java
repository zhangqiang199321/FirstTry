package com.example.xiaoshuo.dao;

import com.example.xiaoshuo.entity.Novel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NovelDao {
    Novel selectOne(@Param("novelName")String NovelName);
    Integer insertOne(@Param("novel") Novel novel);
}
