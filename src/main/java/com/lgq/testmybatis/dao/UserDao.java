package com.lgq.testmybatis.dao;

import com.lgq.testmybatis.obj.UserObj;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<UserObj> findAll();

}
