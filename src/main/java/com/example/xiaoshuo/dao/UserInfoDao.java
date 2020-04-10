package com.example.xiaoshuo.dao;


import com.example.xiaoshuo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoDao {
    UserInfo selectOne(@Param("userId")String name);
    Integer insertOne(@Param("userInfo")UserInfo userInfo);
}
