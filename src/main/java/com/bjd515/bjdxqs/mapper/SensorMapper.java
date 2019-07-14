package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.Sensor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname SensorMapper
 * @Description sensor的model的mapper类
 * @Date 2018/9/19 14:42
 * @Created by zhaoyang
 * @Date 2019/1/17 14:29
 * @Changed by chenghuayu
 * getSensor
 */
@Repository
@Mapper
public interface SensorMapper {

    @Select("SELECT ts.SensorId,ts.SensorCode,ts.SensorName,tsty.typeName,tsta.targetName,tls.sectionName " +
            "FROM t_sensor as ts,t_sensor_type as tsty,t_sensor_target as tsta,t_location_section as tls " +
            "where ts.TypeId = tsty.typeId and ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId")
    public List<Sensor> getSensor();

    @Select("SELECT COUNT(*) from t_sensor")
    public int getSensorTotal();

    @Select("SELECT ts.SensorId,ts.SensorCode,ts.SensorName,tsty.typeName,tsta.targetName,tls.sectionName " +
            "FROM t_sensor as ts,t_sensor_type as tsty,t_sensor_target as tsta,t_location_section as tls " +
            "where ts.TypeId = tsty.typeId and ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId " +
            "and ts.targetId = #{targetId} and ts.sectionId = #{sectionId} and ts.sensorItemId = #{sensorItemId}")
    public List<Sensor> getSensorByOther(Sensor sensor);

    @Select("SELECT COUNT(*) FROM t_sensor as ts where ts.targetId = #{targetId} and ts.sectionId = #{sectionId} and ts.sensorItemId = #{sensorItemId}")
    public int getSensorByOtherTotal(Sensor sensor);

    @Insert("INSERT INTO t_sensor set sensorName=#{sensorName},channelCode=#{channelCode},typeId=#{typeId}," +
            "targetId=#{targetId},sectionId=#{sectionId},initKValue=#{initKValue}," +
            "initWave=#{initWave},initOrientations=#{initOrientations},bdWave=#{bdWave};")
    public int sensorAdd(Sensor sensor);


    @Select("SELECT sensorId,SensorCode,sensorName,channelCode,TypeName,sectionName,InitKValue,InitWave,InitOrientations,BdWave,BdTemperature,info,ts.sDesc\n" +
            "FROM t_sensor as ts JOIN t_sensor_type as tst " +
            " on ts.TypeId = tst.typeId" +
            " JOIN t_location_section as tls" +
            " on tls.sectionId = ts.sectionId" +
            " where ts.sensorId = #{sensorId} ")
    public Sensor getSensorDetail(Sensor sensor);


    @Select("SELECT sensorId,SensorCode,sensorName,channelCode,TypeName,sectionName,InitKValue,InitWave,InitOrientations,BdWave,BdTemperature,info,ts.sDesc\n" +
            "FROM t_sensor as ts JOIN t_sensor_type as tst " +
            " on ts.TypeId = tst.typeId" +
            " JOIN t_location_section as tls" +
            " on tls.sectionId = ts.sectionId" +
            " where ts.sensorId = #{sensorId}")
    public Sensor getSensorEdit(Sensor sensor);


    @Update("update t_sensor set sensorItemId=#{sensorItemId},channelCode=#{channelCode},typeId=#{typeId}," +
            "targetId=#{targetId},sectionId=#{sectionId},initKValue=#{initKValue}," +
            "initWave=#{initWave},initOrientations=#{initOrientations},bdWave=#{bdWave}," +
            "bdTemperature=#{bdTemperature},info=#{info},sDesc=#{sDesc},sensorName=#{sensorName}" +
            " where sensorId=#{sensorId}")
    public int sensorEdited(Sensor sensor);

    @Update("update t_sensor set isValid=0" +
            " where sensorId=#{sensorId}")
    public int sensorDel(Sensor sensor);


}

