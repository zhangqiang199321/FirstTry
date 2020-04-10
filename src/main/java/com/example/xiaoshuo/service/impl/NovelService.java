package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.NovelDao;
import com.example.xiaoshuo.entity.Novel;
import com.example.xiaoshuo.service.INovelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说主表服务，处理小说主表服务
 */
@Service
public class NovelService implements INovelService {
    public static Logger LOGGER = Logger.getLogger(NovelService.class);
    @Autowired
    private NovelDao novelDao;

    /**
     * 根据小说名称查询小说
     * @param name 小说名称
     * @return 小说列表
     */
    @Override
    public Novel getNovelbyName(String name) {
        Novel novel = novelDao.selectOne(name);
        if(novel != null){
            return novel;
        }else {
            LOGGER.info("novel is null");
        }
        return null;
    }
}
