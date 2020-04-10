package com.example.xiaoshuo.dao;

import com.example.xiaoshuo.entity.NovelContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NovelContentDao {
    List<NovelContent> selectList(@Param("novelId")Integer novelId);
    NovelContent selectOne(@Param("novelId")Integer novelId,@Param("chapterId")Integer chapterId);
}
