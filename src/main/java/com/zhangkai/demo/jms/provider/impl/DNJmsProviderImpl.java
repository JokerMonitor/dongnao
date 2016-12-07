package com.zhangkai.demo.jms.provider.impl;

import com.zhangkai.demo.jms.provider.DNJmsProvider;

/**
 * Created by zhangkai on 11/25/16.
 */
public class DNJmsProviderImpl implements DNJmsProvider {
  public void init() {

  }

  public void sendMessage(String queueName) {

  }

  /*private ConnectionFactory connectionFactory;

  private Connection connection;

  private Session session;

  private Queue queue;

  private final static String URL = ActiveMQConnection.DEFAULT_BROKER_URL;

  private final static String USERNAME = ActiveMQConnection.DEFAULT_USER;

  private final static String PWD = ActiveMQConnection.DEFAULT_PASSWORD;


  public void init() {
    try {
      connectionFactory = new ActiveMQConnectionFactory(USERNAME,PWD,URL);

      connection = connectionFactory.createConnection();

      connection.start();

      session = connection.createSession(true,Session.SESSION_TRANSACTED);

    } catch (JMSException e) {
      e.printStackTrace();
    }

  }

  public void sendMessage(String queueName) {
    try {
      queue = session.createQueue(queueName);
      MessageProducer producer = session.createProducer(queue);
      for(int i=0;i<100;i++) {
        TextMessage message = session.createTextMessage();
        message.setText("留一手 " + i);
        producer.send(message);
      }
      session.commit();
    } catch (JMSException e) {
      e.printStackTrace();
    }finally {
      if(connection != null){
        try {
          connection.close();
        } catch (JMSException e) {
          e.printStackTrace();
        }
      }
    }
  }*/
}
