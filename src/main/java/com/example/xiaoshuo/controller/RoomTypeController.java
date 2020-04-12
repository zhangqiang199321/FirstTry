package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.service.IRoomTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 查找需求房型
 */
@Controller
@RequestMapping("/fangyuan")
public class RoomTypeController {

    @Resource
    public IRoomTypeService iRoomTypeService;
    @RequestMapping("/jiangninga/{type}")
    public String get(@PathVariable String type){
        iRoomTypeService.getRoomType(type);
        return "index";
    }
    @RequestMapping("/jiangninga/")
    public String getall(){
        return "index";
    }
}
