package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.User;
import com.bjd515.bjdxqs.utils.DateUtilsMy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Classname UserMapperTest
 * @Description TODO
 * @Date 2018/10/8 15:00
 * @Created by zhaoyang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAllUsers() {
        List<User> list = userMapper.getAllUsers();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserCode("teststetst");
        user.setUserName("tetsetset");
        user.setUserPass("teststs");
        user.setRealName("rets");
        user.setTel("123");
        user.setOfficTel("124312412");
        user.setEmail("1234124");
        user.setJob("asfaf");
        user.setRoleGrade(1);
        String time = DateUtilsMy.getCurrentTiem();
        user.setCreateDate(time);
        user.setIsEnable(1);
        user.setsDesc("");
        int rs = userMapper.insertUser(user);
        System.out.println(rs);
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setSeqId(20);
        user.setUserCode("teststetst");
        user.setUserName("tetsetset");
        user.setUserPass("teststs");
        user.setRealName("rets");
        user.setTel("123");
        user.setOfficTel("124312412");
        user.setEmail("1234124");
        user.setJob("asfaf");
        user.setRoleGrade(1);
        String time = DateUtilsMy.getCurrentTiem();
        user.setCreateDate(time);
        user.setIsEnable(0);
        user.setsDesc("");
        int rs = userMapper.updateUser(user);
        System.out.println(rs);
    }

    @Test
    public void deletedUser() {
        int rs = userMapper.deletedUser(19);
        System.out.println(rs);
    }
}