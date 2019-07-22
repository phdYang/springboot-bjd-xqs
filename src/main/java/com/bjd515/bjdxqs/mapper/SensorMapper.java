package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.mapper.sqlUtils.SensorSql;
import com.bjd515.bjdxqs.model.Sensor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname SensorMapper
 * @Description sensor的model的mapper类
 * @Date 2018/9/19 14:42
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * @Date 2019/7/16 18:50
 * @Changed by zhaoyang
 * getSensor
 */
@Repository
@Mapper
public interface SensorMapper {

    @Select("SELECT ts.SensorId,ts.SensorCode,ts.SensorName,ts.SensorItemId,tsty.typeName,tsta.targetName,tls.sectionName " +
            "FROM t_sensor as ts,t_sensor_type as tsty,t_sensor_target as tsta,t_location_section as tls " +
            "where ts.TypeId = tsty.typeId and ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId" +
            " and ts.isValid=1")
    public List<Sensor> getSensor();

    @Select("SELECT COUNT(*) from t_sensor where isValid=1")
    public int getSensorTotal();

    @SelectProvider(type = SensorSql.class,method = "getSensorByOtherSQL")
    public List<Sensor> getSensorByOther(Sensor sensor);

    @SelectProvider(type = SensorSql.class, method = "getSensorByOtherTotalSQL")
    public int getSensorByOtherTotal(Sensor sensor);

    @Insert("INSERT INTO t_sensor set sensorCode=#{sensorCode}, sensorName=#{sensorName},channelCode=#{channelCode},typeId=#{typeId}," +
            "targetId=#{targetId},sectionId=#{sectionId},initKValue=#{initKValue},initValue=#{initKValue}," +
            "initWave=#{initWave},initOrientations=#{initOrientations},bdWave=#{bdWave}, bdTemperature=#{bdTemperature}," +
            " info=#{info},sDesc=#{sDesc},isValid=#{isValid}")
    public int sensorAdd(Sensor sensor);


    @Select("SELECT ts.sensorId,ts.targetId,ts.sectionId,ts.typeId,ts.sensorItemId," +
            "ts.sensorName,tsta.targetName,tls.sectionName,tsty.typeName," +
            "ts.channelCode,ts.sensorCode,ts.initKValue,ts.initWave,ts.initOrientations," +
            "ts.bdWave,ts.bdTemperature,ts.info,ts.sDesc " +
            " FROM t_sensor as ts , t_sensor_target as tsta, t_location_section as tls, t_sensor_type as tsty " +
            " WHERE ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId and ts.TypeId = tsty.TypeId " +
            " and ts.sensorId = #{sensorId} ")
    public Sensor getSensorDetail(Sensor sensor);


    @Select("SELECT ts.sensorId,ts.targetId,ts.sectionId,ts.typeId,ts.sensorItemId," +
            "ts.sensorName,tsta.targetName,tls.sectionName,tsty.typeName," +
            "ts.channelCode,ts.sensorCode,ts.initKValue,ts.initWave,ts.initOrientations," +
            "ts.bdWave,ts.bdTemperature,ts.info,ts.sDesc " +
            " FROM t_sensor as ts , t_sensor_target as tsta, t_location_section as tls, t_sensor_type as tsty " +
            " WHERE ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId and ts.TypeId = tsty.TypeId " +
            " and ts.sensorId = #{sensorId} ")
    public Sensor getSensorEdit(Sensor sensor);

    //TODO 删除了sensorItemId=#{sensorItemId},
    @Update("update t_sensor set channelCode=#{channelCode},typeId=#{typeId}," +
            "targetId=#{targetId},sectionId=#{sectionId},initKValue=#{initKValue}," +
            "initWave=#{initWave},initOrientations=#{initOrientations},bdWave=#{bdWave}," +
            "bdTemperature=#{bdTemperature},info=#{info},sDesc=#{sDesc},sensorName=#{sensorName}" +
            " where sensorId=#{sensorId}")
    public int sensorEdited(Sensor sensor);

    @Update("update t_sensor set isValid=0" +
            " where sensorId=#{sensorId}")
    public int sensorDel(Sensor sensor);

    @Select("select sensorName from t_sensor where sensorId =#{1}")
    public String getSensorName(String sensorId);


}

