package com.ymPrac.dubbo.annotation.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * Created by Yan Meng on 2016/9/21.
 */
//@Configuration  //配置控制
//@EnableAutoConfiguration    //启用自动配置
//@ComponentScan  //组件扫描
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(value = "com.ymPrac.dubbo.annotation.consumer")
public class App {

    //启动Spring Boot项目的唯一入口
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
