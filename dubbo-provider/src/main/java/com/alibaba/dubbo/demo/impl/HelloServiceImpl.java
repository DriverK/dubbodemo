/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: HelloServiceImpl
 * Author:   admin
 * Date:     2017/10/26 1:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.HelloService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2017/10/26
 * @since 1.0.0
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello World";
    }
}
