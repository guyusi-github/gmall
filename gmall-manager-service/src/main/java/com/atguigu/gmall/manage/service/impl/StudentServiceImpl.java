package com.atguigu.gmall.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.Student;
import com.atguigu.gmall.service.StudentService;



import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }
}
