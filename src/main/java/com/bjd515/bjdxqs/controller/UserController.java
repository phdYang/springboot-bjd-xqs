package com.bjd515.bjdxqs.controller;

import com.alibaba.fastjson.JSON;
import com.bjd515.bjdxqs.model.User;
import com.bjd515.bjdxqs.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname UserController
 * @Description TODO controller
 * @Date 2018/10/8 15:17
 * @Created by zhaoyang
 */

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 前端根据/user/getAllUsers路径访问获取所有用户的方法
     * @return json
     */
    @PostMapping("/getAllUsers")
    public String getAllUsers(){
        return userService.getAllUsers();
    }

    /**
     * 前端根据/user/deletedUser/{}路径访问删除用户方法
     * @return
     */
    @PostMapping("/deletedUser/{id}")
    public String deletedUser(@PathVariable("id") Integer id){
       // System.out.println(id);
       return userService.deletedUser(id);
    }

    /**
     * 前端根据/user/updateUser/{} 路径访问更新用户的方法
     * @param user
     * @return
     */
    @PostMapping("/updateUser/{user}")
    public String updateUser(@PathVariable("user") String user){
        return userService.updateUser(user);
    }

    @PostMapping("/insertUser/{user}")
    public String insertUser(@PathVariable("user") String user){
        return userService.insertUser(user);
    }


    @GetMapping("/login")
    @ResponseBody
    public String login(User user){
        return userService.login(user);
    }

}
