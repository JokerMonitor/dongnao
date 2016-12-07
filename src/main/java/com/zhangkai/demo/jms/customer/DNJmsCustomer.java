package com.zhangkai.demo.jms.customer;

/**
 * Created by zhangkai on 11/25/16.
 */
public interface DNJmsCustomer {
  void init();

  void receive(String queueName);
}
