package com.zhangkai.demo.service.impl;

import com.zhangkai.demo.mapper.StudentMapper;
import com.zhangkai.demo.pojo.Student;
import com.zhangkai.demo.service.AbstractBaseService;
import com.zhangkai.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangkai on 12/7/16.
 */
@Service(value = "studentService")
public class StudentServiceImpl extends AbstractBaseService<Student,Long>  implements
  IStudentService{
  @Autowired
  private StudentMapper studentMapper;

  @Autowired
  protected void setUserMapper(){
    super.setBaseMapper(studentMapper);
  }

}
