package com.atguigu.gmall.controller;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    UserService userService;

    @RequestMapping(value = "trade",method = RequestMethod.GET)
    @ResponseBody
    public List<UserAddress> trade(String userId){
        return userService.getUserAddressList(userId);
    }
}
