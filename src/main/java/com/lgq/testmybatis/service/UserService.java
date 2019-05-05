package com.lgq.testmybatis.service;

import com.lgq.testmybatis.obj.UserObj;

import java.util.List;

public interface UserService {

    public List<UserObj> findAll();
}
