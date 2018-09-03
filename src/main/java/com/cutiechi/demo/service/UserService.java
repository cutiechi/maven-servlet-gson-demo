package com.cutiechi.demo.service;

import com.cutiechi.demo.model.dto.ServiceResult;
import com.cutiechi.demo.model.entity.User;

import java.util.List;

public interface UserService {

    ServiceResult<List<User>> listAll ();
}
