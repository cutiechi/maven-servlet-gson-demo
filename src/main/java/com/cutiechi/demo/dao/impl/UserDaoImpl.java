package com.cutiechi.demo.dao.impl;

import com.cutiechi.demo.dao.UserDao;
import com.cutiechi.demo.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    
    @Override
    public List<User> listAll () {
        List<User> users = new ArrayList<>();
        users.add(new User(20180903, "hello", "gson"));
        users.add(new User(20111111, "json", "hello"));
        return users;
    }
}
