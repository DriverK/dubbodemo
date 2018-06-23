/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: DemoServiceImpl
 * Author:   admin
 * Date:     2017/10/25 23:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author admin
 * @create 2017/10/25
 * @since 1.0.0
 */
public class DemoServiceImpl implements DemoService{

    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

    @Override
    public String getHello() {
        return "Hello World";
    }
}
