package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.Device;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname DeviceMapper
 * @Description device的model的mapper类
 * @Date 2019/1/18 17:45
 * @Created by chenghuayu
 */
@Repository
@Mapper
public interface DeviceMapper {

    @Select("SELECT *" +
            " FROM t_device WHERE isValid = 1")
    public List<Device> getDevice();

    @Select("SELECT COUNT(*) from t_device WHERE isValid = 1")
    public int getDeviceTotal();

    @Select("SELECT * " +
            " FROM t_device" +
            " WHERE deviceName=#{1} AND isValid = 1")
    public List<Device> getDeviceByOther(String deviceName);

    @Select("SELECT count(*) FROM t_device WHERE deviceName=#{1} AND isValid = 1")
    public int getDeviceByOtherTotal(String deviceName);

    @Insert("INSERT INTO t_device set deviceUse=#{deviceUse},deviceCode=#{deviceCode},deviceFre=#{deviceFre},deviceName=#{deviceName},deviceIp=#{deviceIp},deviceDate=#{deviceDate},channelCount=#{channelCount},isValid=#{isValid},sdesc=#{sdesc} ")
    public int deviceAdd(Device device);


    @Select("SELECT * " +
            " FROM t_device" +
            " WHERE deviceId=#{deviceId}")
    public Device getDeviceDetail(Device device);


    @Select("SELECT * " +
            " FROM t_device" +
            " WHERE deviceId=#{deviceId}")
    public Device getDeviceEdit(Device device);


    @Update("UPDATE t_device set deviceUse=#{deviceUse},deviceFre=#{deviceFre},deviceName=#{deviceName},deviceIp=#{deviceIp},channelCount=#{channelCount},sdesc=#{sdesc},deviceDate=#{deviceDate} " +
            " WHERE deviceId=#{deviceId}")
    public int deviceEdited(Device device);

    @Update("update t_device set isValid=0" +
            " where deviceId=#{deviceId}")
    public int deviceDel(Device device);


}

