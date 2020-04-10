package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.NovelContentDao;
import com.example.xiaoshuo.entity.Novel;
import com.example.xiaoshuo.entity.NovelContent;
import com.example.xiaoshuo.service.INovelContentService;
import com.example.xiaoshuo.service.INovelService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说章节服务类，处理小说章节服务
 */
@Service
public class NovelContentService implements INovelContentService {
    public static Logger LOGGER = Logger.getLogger(NovelContentService.class);
    @Resource
    private INovelService iNovelService;
    @Resource
    private NovelContentDao novelContentDao;

    /**
     * 查询下一章小说的内容
     * @param novelName 小说的名称，根据小说的名称查询小说的id
     * @param chapterId 本章id，根据本章id查询下一章的小说内容
     * @return 小说的章节
     */
    @Override
    public NovelContent getNovelContent(String novelName,Integer chapterId) {
        LOGGER.info("进入 NovelContentService getNovelContent");
        if(novelName != null && chapterId != null){
            Novel novelbyName = iNovelService.getNovelbyName(novelName);
            if(novelbyName != null){
                Integer id = novelbyName.getId();
                NovelContent novelContent = novelContentDao.selectOne(id, chapterId);
                if(novelContent != null){
                    return novelContent;
                }else{
                    LOGGER.info("NovelContentService getNovelContent novelContent is null");
                }
            }else{
                LOGGER.info("NovelContentService getNovelContent novelbyName is null");
            }
        }else {
            LOGGER.info("NovelContentService getNovelContent novelName:"+novelName+",chapterId:"+chapterId);
        }
        return null;
    }

    @Override
    public List<NovelContent> getNovelContentList(String novelName) {
        LOGGER.info("进入 NovelContentService getNovelContentList");
        if(novelName != null){
            Novel nov = iNovelService.getNovelbyName(novelName);
            if(nov != null){
                Integer id = nov.getId();
                List<NovelContent> novelContentList = novelContentDao.selectList(id);
                if(novelContentList != null && novelContentList.size() > 0){
                    return  novelContentList;
                }else{
                    LOGGER.info("NovelContentService-getNovelContentList-novelContentList is null");
                }
            }else{
                LOGGER.info("NovelContentService-getNovelContentList-nov is null");
            }
        }else {
            LOGGER.info("NovelContentService-getNovelContentList novelName is null");
        }
        return null;
    }
}
