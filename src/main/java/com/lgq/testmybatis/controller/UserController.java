package com.lgq.testmybatis.controller;

import com.lgq.testmybatis.obj.UserObj;
import com.lgq.testmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list")
    public List<UserObj> list()
    {
        return userService.findAll();
    }
}
