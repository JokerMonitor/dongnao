package com.zhangkai.demo.service;

import java.io.Serializable;

/**
 * Created by zhangkai on 12/7/16.
 */
public interface BaseService<T,ID extends Serializable> {
  int deleteByPrimaryKey(ID id);
  int insert(T record);
  int insertSelective(T record);
  T selectByPrimaryKey(ID id);
  int updateByPrimaryKeySelective(T record);
  int updateByPrimaryKey(T record);
}
