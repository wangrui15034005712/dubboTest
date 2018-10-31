package com.alibaba.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.demo.DemoService;

/**
 * Created by wr on 2018/10/31.
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));
    }
}