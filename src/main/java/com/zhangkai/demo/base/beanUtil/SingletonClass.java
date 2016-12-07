package com.zhangkai.demo.base.beanUtil;

/**
 * Created by zhangkai on 11/15/16.
 */
public class SingletonClass {

  private static SingletonClass tl = new SingletonClass();
  private Integer id;
  private String name;
  private SingletonClass(){}
  private static SingletonClass instance ;
  public static SingletonClass getInstance(){
    if(instance == null){
      synchronized(SingletonClass.class){
        if(instance == null){
          instance = new SingletonClass();
        }
      }
    }
    return instance;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
