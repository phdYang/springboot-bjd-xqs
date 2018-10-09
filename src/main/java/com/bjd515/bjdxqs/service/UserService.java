package com.bjd515.bjdxqs.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bjd515.bjdxqs.mapper.UserMapper;
import com.bjd515.bjdxqs.model.User;
import com.bjd515.bjdxqs.utils.DateUtilsMy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO user的service类
 * @Date 2018/10/8 15:17
 * @Created by zhaoyang
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有user,将mapper的list转换为json串
     * @return
     */
    public String getAllUsers(){
        String rs = "";
        JSONObject jsonObject = new JSONObject();
        List<User> list = userMapper.getAllUsers();
        if(list != null) {
            rs = jsonObject.toJSONString(list);
        }else {
            rs = "[]";
        }
        return rs;
    }

    /**
     * 根据id删除一条数据
     * @param id
     * @return
     */
    public String deletedUser(int id){
        String rs = "";
        int record = userMapper.deletedUser(id);
        if(record > 0){
            rs = "1";
        }else {
            rs = "0";
        }
        return rs;
    }

    /**
     * 根据id更新一名用户
     * @param json
     * @return
     */
    public String updateUser(String json){
        String rs = "";
        User user = JSON.parseObject(json,User.class);
        int record = userMapper.updateUser(user);
        if(record > 0){
            rs = "1";
        }else {
            rs = "0";
        }
        return rs;
    }

    /**
     * 新增一名用户
     * @param json
     * @return
     */
    public String insertUser(String json){
        String rs = "";
        User user = JSON.parseObject(json,User.class);
        //获取当前时间戳
        String timeStap = DateUtilsMy.getTimeStap();
        user.setUserCode(timeStap);
        user.setUserPass("666666");
        //获取当前时间
        String currTime = DateUtilsMy.getCurrentTiem();
        user.setCreateDate(currTime);
        user.setIsEnable(1);
        int record = userMapper.insertUser(user);
        if(record > 0){
            rs = "1";
        }else {
            rs = "0";
        }
        return rs;
    }
}
