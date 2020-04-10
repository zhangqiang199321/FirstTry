package com.example.xiaoshuo.vo;

import java.io.Serializable;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 前端返回字段
 */
public class JsonResult implements Serializable {
    private int state = 1;
    private String message = "ok";
    private Object data;

    public JsonResult(int state) {
        this.state = state;
    }

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(int state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
