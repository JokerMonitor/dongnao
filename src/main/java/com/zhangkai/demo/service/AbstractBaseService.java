package com.zhangkai.demo.service;

import com.zhangkai.demo.mapper.BaseMapper;

import java.io.Serializable;

/**
 * Created by zhangkai on 12/7/16.
 */
public abstract class AbstractBaseService<T,ID extends Serializable> implements
  BaseService<T,ID> {

  private BaseMapper<T, ID> baseMapper;

  public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
    this.baseMapper = baseMapper;
  }
  public int deleteByPrimaryKey(ID id) {
    return baseMapper.deleteByPrimaryKey(id);
  }
  public int insertSelective(T record) {
    return baseMapper.insertSelective(record);
  }
  public T selectByPrimaryKey(ID id) {
    return baseMapper.selectByPrimaryKey(id);
  }
  public int updateByPrimaryKeySelective(T record) {
    return baseMapper.updateByPrimaryKey(record);
  }
  public int updateByPrimaryKey(T record) {
    return baseMapper.updateByPrimaryKey(record);
  }
  public int insert(T record) {
    return baseMapper.insert(record);
  }
}
