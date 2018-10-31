package com.alibaba.dubbo.demo.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wr on 2018/10/31.
 */
public class Provider {
        public static void main(String[] args) throws IOException {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
            System.out.println(context.getDisplayName() + ": here");
            context.start();
            System.out.println("服务已经启动...");
            System.in.read();
        }
    }

