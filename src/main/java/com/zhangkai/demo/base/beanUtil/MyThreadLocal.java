package com.zhangkai.demo.base.beanUtil;

/**
 * Created by zhangkai on 11/15/16.
 */
public class MyThreadLocal {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      new Thread(new Runnable() {
        public void run() {
          SingletonClass demo = SingletonClass.getInstance();
          System.out.println("本次线程id: " + Thread.currentThread().getId() + ",实例内存地址: " + demo);
        }
      }).start();
    }
  }
}

