package com.bjd515.bjdxqs.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorDataMapperTest {

    @Autowired
    private MonitorDataMapper repository;
    @Test
    public void getMonitorData() {
        System.out.println(repository.getMonitorData("2018-01-14","2018-01-20","1"));
    }
}