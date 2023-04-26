/***************************************************************************
 *
 * Copyright (c) 2022 www.jd.com, Inc. All Rights Reserved
 *
 **************************************************************************/
package test.spring.liuzhi;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * TODO:desc
 * </p>
 *
 * @author liuzhi18
 * @date 2023/04/24
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    protected void initPropertySources() {
        //设置需要校验的属性值
        getEnvironment().setRequiredProperties("username");
        System.err.println("My initPropertySources");
    }
}
