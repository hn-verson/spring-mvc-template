package com.vivo.service;

import com.vivo.dao.mapper.UserMapper;
import com.vivo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by verson on 2017/7/16.
 */
@Service
public class UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public void addUser() {
        //nothing
    }

    public void deleteUser() {
        //nothing
    }

    public void updateUser() {
        //nothing
    }

    public User getUser() {
        //nothing
        return null;
    }

}
