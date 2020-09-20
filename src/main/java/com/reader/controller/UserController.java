package com.reader.controller;

import com.reader.entity.User;
import com.reader.service.UserService;
import com.reader.util.Page;
import com.reader.util.ResponseData;
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
    @GetMapping("/queryUserList/{name}")
    public ResponseData queryUser(@PathVariable("name")
                                @RequestParam(value="keyWord") String keyword,
                                @RequestParam("keyType") String keyType) {
        Page page = new Page();

        if("".equals(keyword) || keyword==null){
            return null;
        }
        page.setKeyWord(keyword);
        page.setKeyType(keyType);
        System.out.println(page.toString()+page.getPage());
//        List<User> list = new ArrayList<>();
        ResponseData responseData = new ResponseData();
        responseData.setData(userService.queryUserList(page));
//        list = userService.queryUserList(page);
//        System.out.println(list);
//        return userService.queryUserList(page);
        System.out.println(responseData.toString());
        return responseData;
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

    @PutMapping("/putApi/{path}")
    public String testPut(@PathVariable("path") String path){
        System.out.println(path+"vvvvvvvvvvvvvvvvvvvvvvvvv");
        return "putResultful成功！！！！";
    }

    @DeleteMapping("/deleteApi/{id}")
    public String testDelete(){
        return "deleteResultful成功！！！！";
    }



}
