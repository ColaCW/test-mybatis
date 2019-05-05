package com.lgq.testmybatis.service.impl;

import com.lgq.testmybatis.dao.UserDao;
import com.lgq.testmybatis.obj.UserObj;
import com.lgq.testmybatis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserObj> findAll() {
        return userDao.findAll();
    }
}
