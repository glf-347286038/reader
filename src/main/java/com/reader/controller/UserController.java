package com.reader.controller;

import com.reader.model.User;
import com.reader.service.UserService;
import com.reader.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("/addUser")
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

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
    /**
     * @Author:高凌峰
     * @Date 2020-09-08 21:27:42
     * 登录检查
    */
    @PostMapping("/login")
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

    //查询所有用户
    //get请求不支持@RequestBody
    @GetMapping("/queryUserList")
    public List<User> queryUser(@RequestParam(value="keyWord") String username,
                                @RequestParam("keyType") String keyType) {
        Page page = new Page();
        page.setKeyWord(username);
        page.setKeyType(keyType);
        System.out.println(page.toString()+page.getPage());
        List<User> list = new ArrayList<>();
        list = userService.queryUserList(page);
        System.out.println(list);
        return userService.queryUserList(page);
    }





    /**
     * @Author:高凌峰
     * @Date 2020-09-08 21:58:14
     * 测试resultful
    */
    @PostMapping("/postApi/{id}")
    public String testPost(@PathVariable String id){
        return "postresultful成功";
    }

    @PutMapping("/putApi")
    public String testPut(){
        return "putResultful成功！！！！";
    }

    @DeleteMapping("/deleteApi/{id}")
    public String testDelete(){
        return "deleteResultful成功！！！！";
    }



}
