package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.service.IRoomTypeService;
import org.springframework.stereotype.Service;

/**
 * 根据前端的需求类型返回相应的房型信息
 * 并且对首页的页面展示进行更改
 */
@Service
public class RoomTypeService implements IRoomTypeService {
    @Override
    public String getRoomType(String type) {
        if(null != type){
            String[] split = type.split("-");
            for (int i = 0; i < split.length; i++) {
                String page = getTypeByPrice(split[i]);
            }
        }
        return null;
    }

    private String getTypeByPrice(String price) {
        if(price.startsWith("zj20")){

        }
        return null;
    }
}
