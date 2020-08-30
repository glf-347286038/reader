package com.reader.mapper;

import com.reader.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    /**
     * @Author:高凌峰
     * @Date 2020-08-29 23:24:03
    */
    int addUser(User user);

    /**
     * @Author:高凌峰
     * @Date 2020-08-30 00:11:30
     * 根据用户名批量删除
    */
    int deleteUserById(List<String> list);

    int updateUser(User user);

    /**
     * @Author:高凌峰
     * @Date 2020-08-29 23:25:02
     * 根据用户Id查询出用户信息
    */
    User getUser(User user);

    /**
     * @Author:高凌峰
     * @Date 2020-08-29 23:25:24
     * 批量查询出所有用户数据
    */
    List<User> queryUserList();
}
