package com.vivo.service;

import com.vivo.base.BaseJunit4Test;
import com.vivo.dao.mapper.UserMapper;
import com.vivo.domain.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by verson on 2017/7/16.
 */
public class UserServiceTest extends BaseJunit4Test {

    private static User testUser;

    @Autowired
    private UserMapper userMapper;

    @BeforeClass
    public static void init() {
        testUser = new User();
        testUser.setUserId("111111");
        testUser.setUsername("verson");
        testUser.setPassword("******");
        testUser.setCreateTime(new Date());
        testUser.setUpdateTime(new Date());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void addUser() {
        userMapper.addUser(testUser);
        Assert.assertTrue(testUser.getId() > 0);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void deleteUser() {
        userMapper.deleteUser(testUser.getId());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void updateUser() {
        userMapper.updateUser(testUser);
    }

    @Test
    @Transactional
    @Rollback(true)
    public void getUser() {
        userMapper.addUser(testUser);
        User user = userMapper.getUser(testUser.getId());
        Assert.assertTrue(user.getUserId().equals(testUser.getUserId()));
    }

}
