package com.zhangkai.demo.mapper;

import java.io.Serializable;

/**
 * Created by zhangkai on 12/7/16.
 */
public interface BaseMapper<T,ID extends Serializable> {
  int deleteByPrimaryKey(ID id);
  int insert(T record);
  int insertSelective(T record);
  T selectByPrimaryKey(ID id);
  int updateByPrimaryKeySelective(T record);
  int updateByPrimaryKey(T record);
}
