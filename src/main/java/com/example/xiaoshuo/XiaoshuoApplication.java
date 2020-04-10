package com.example.xiaoshuo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.xiaoshuo")
public class XiaoshuoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoshuoApplication.class, args);
    }

}
