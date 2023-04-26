/***************************************************************************
 *
 * Copyright (c) 2022 www.jd.com, Inc. All Rights Reserved
 *
 **************************************************************************/
package test.spring.liuzhi;

import beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * TODO:desc
 * </p>
 *
 * @author liuzhi18
 * @date 2023/04/18
 */
public class SpTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("beans.xml");
        Person bean = applicationContext.getBean(Person.class);
        System.err.println(bean);
    }
}
