package com.zhangkai.demo.controller;

import com.zhangkai.demo.pojo.TestPojo;
import com.zhangkai.demo.pojo.User;
import com.zhangkai.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangkai on 11/14/16.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
  @Autowired
  private IUserService userService;

  @Autowired
  private JedisCluster jedisCluster;

  @RequestMapping(method = RequestMethod.GET)
  public List<TestPojo> getInfo(){
    List<TestPojo> list = new ArrayList();
    for(int i = 0 ; i<10 ; i++){
      TestPojo pojo = new TestPojo();
      pojo.setName("A" + i);
      list.add(pojo);
    }
    return list;
  }
  @RequestMapping(value = "/getUserInfo/{id}",method = RequestMethod.GET)
  public User getUserInfo(@PathVariable Long id, HttpServletRequest request){
    User user = userService.selectByPrimaryKey(id);
    jedisCluster.set(user.getId().toString(),user.toString());
    return user;
  }

}
