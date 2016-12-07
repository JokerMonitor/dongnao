package com.zhangkai.demo.service.impl;

import com.zhangkai.demo.mapper.UserMapper;
import com.zhangkai.demo.pojo.User;
import com.zhangkai.demo.service.AbstractBaseService;
import com.zhangkai.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangkai on 11/14/16.
 */
@Service(value = "userService")
public class UserServiceImpl extends AbstractBaseService<User,Long> implements IUserService {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  public void setUserMapper(){
    super.setBaseMapper(userMapper);
  }



}
