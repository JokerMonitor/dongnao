package com.zhangkai.demo.test;

import com.zhangkai.demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhangkai on 11/25/16.
 */
public class JmsProviderTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
    User user = (User)context.getBean("user");
    System.out.println(user.toString());
  }
}
