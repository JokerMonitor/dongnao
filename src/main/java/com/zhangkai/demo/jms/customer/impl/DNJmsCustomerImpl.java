package com.zhangkai.demo.jms.customer.impl;

import com.zhangkai.demo.jms.customer.DNJmsCustomer;

/**
 * Created by zhangkai on 11/25/16.
 */
public class DNJmsCustomerImpl implements DNJmsCustomer {
  public void init() {

  }

  public void receive(String queueName) {

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

      session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);

    } catch (JMSException e) {
      e.printStackTrace();
    }

  }

  public void receive(String queueName) {
    try {
      queue = session.createQueue(queueName);
      MessageConsumer consumer = session.createConsumer(queue);
      MessageListener listener = new MessageListenerImpl();
      while (true){
        consumer.setMessageListener(listener);
      }

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
