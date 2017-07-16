package com.vivo.dao.mapper;

import com.vivo.domain.User;

/**
 * Created by verson on 2017/7/16.
 */
public interface UserMapper {

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User getUser(long id);

}
