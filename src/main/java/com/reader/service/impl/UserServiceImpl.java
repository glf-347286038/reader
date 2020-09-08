package com.reader.service.impl;

import com.reader.mapper.UserMapper;
import com.reader.model.User;
import com.reader.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUserById(List<Integer> listId) {
        return userMapper.deleteUserById(listId);
    }

    @Override
    public int updateUser(User user) {
        return updateUser(user);
    }

    @Override
    /**
     * 登录验证或查询单个用户信息
     */
    public User getUser(User user) {
        return userMapper.getUser(user);
    }

    @Override
    public List<User> queryUserList() {
        return null;
    }
}
