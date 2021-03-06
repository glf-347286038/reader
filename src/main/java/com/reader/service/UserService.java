package com.reader.service;

import com.reader.entity.User;
import com.reader.util.Page;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUserById(List<Integer> list);
    int updateUser(User user);

    /**
     * 根据用户Id查询出用户信息
     */
    User getUser(User user);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> queryUserList(Page page);
}
