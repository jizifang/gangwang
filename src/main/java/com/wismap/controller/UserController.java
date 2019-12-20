package com.wismap.controller;

import com.alibaba.fastjson.JSON;
import com.wismap.mapper.UserMapper;
import com.wismap.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public String getAll(){
        List<User> users = userMapper.selectAll();
        return JSON.toJSONString(users);
    }

}
