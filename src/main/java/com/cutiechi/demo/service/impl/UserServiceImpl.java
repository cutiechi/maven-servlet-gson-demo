package com.cutiechi.demo.service.impl;

import com.cutiechi.demo.dao.UserDao;
import com.cutiechi.demo.dao.impl.UserDaoImpl;
import com.cutiechi.demo.model.dto.ServiceResult;
import com.cutiechi.demo.model.entity.User;
import com.cutiechi.demo.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    public UserServiceImpl () {
        this.userDao = new UserDaoImpl();
    }
    
    @Override
    public ServiceResult<List<User>> listAll () {
        return new ServiceResult<>(true, "获取全部用户列表成功！", userDao.listAll());
    }
}
