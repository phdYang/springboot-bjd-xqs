package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.Sensor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname SensorMapper
 * @Description sensor的model的mapper类
 * @Date 2018/9/19 14:42
 * @Created by zhaoyang
 */
@Repository
@Mapper
public interface SensorMapper {

    @Select("SELECT SensorId,SensorName,targetId,sectionId,TypeId FROM t_sensor")
    public List<Sensor> getAllSensors();
}
