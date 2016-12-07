package com.zhangkai.demo.jms.provider;

/**
 * Created by zhangkai on 11/25/16.
 */
public interface DNJmsProvider {
   void init();

   void sendMessage(String queueName);
}
