/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: Provider
 * Author:   admin
 * Date:     2017/10/26 0:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2017/10/26
 * @since 1.0.0
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + "：here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }

}
