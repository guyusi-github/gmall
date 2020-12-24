package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.mapper.UserInfoMapper;
import com.atguigu.gmall.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void updateUser(UserInfo userInfo) {

    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }
}
