package com.reader.controller;

import com.reader.model.User;
import com.reader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    public int addUser(User user) {
//        return 0;
//    }

//    public int deleteUserById(Integer userId) {
//        return 0;
//    }

//    public int updateUser(User user) {
//        return 0;
//    }

    /**
     * @RequestBody接受的是一个json对象的字符串，而不是Json对象,在请求时往往都是
     * json对象，用JSON。stringify(data)的方式就能将对象变成json字符串
     *  前端请求传Json对象则后端使用@RequestParam
     *  前端请求传Json对象的字符串则后端使用@RequestBody
     */
//    @CrossOrigin
    @RequestMapping("/login")
    public String getUser(@RequestBody User user) {
        if(userService.getUser(user)!=null){
            /**
             * 如果在数据库中查到数据，则修改数据库中最后登录时间
             */
            return "true";
        }else {
            return "false";
        }
    }

//    public List<User> queryUser() {
//        return null;
//    }
}
