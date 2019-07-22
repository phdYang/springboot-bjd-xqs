package com.bjd515.bjdxqs.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SensorMapperTest {

    @Autowired
    private SensorMapper sensorMapper;

    @Test
    public void getSensoIdTest(){
        System.out.println(sensorMapper.getSensorName("1"));
    }
}