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

    @Select("SELECT deviceId, deviceFre,deviceName,deviceIp,channelCount,isValid,sDesc" +
            " FROM t_device")
    public List<Device> getDevice();

    @Select("SELECT COUNT(*) from t_device")
    public int getDeviceTotal();

    @Select("SELECT deviceId, deviceFre,deviceName,deviceIp,channelCount,isValid,sDesc" +
            " FROM t_device" +
            " WHERE deviceName=#{deviceName} ")
    public List<Device> getDeviceByOther(Device device);

    @Select("SELECT count(*) FROM t_device WHERE deviceName=#{deviceName}")
    public int getDeviceByOtherTotal(Device device);

    @Insert("INSERT INTO t_device set deviceFre=#{deviceFre},deviceName=#{deviceName},deviceIp=#{deviceIp},channelCount=#{channelCount},isValid=#{isValid},sDesc=#{sDesc} ")
    public int deviceAdd(Device device);


    @Select("SELECT deviceId, deviceFre,deviceName,deviceIp,channelCount,isValid,sDesc" +
            " FROM t_device" +
            " WHERE deviceId=#{deviceId}")
    public Device getDeviceDetail(Device device);


    @Select("SELECT deviceId, deviceFre,deviceName,deviceIp,channelCount,isValid,sDesc" +
            " FROM t_device" +
            " WHERE deviceId=#{deviceId}")
    public Device getDeviceEdit(Device device);


    @Update("UPDATE t_device set deviceFre=#{deviceFre},deviceName=#{deviceName},deviceIp=#{deviceIp},channelCount=#{channelCount},isValid=#{isValid},sDesc=#{sDesc} " +
            " WHERE deviceId=#{deviceId}")
    public int deviceEdited(Device device);

    @Update("update t_device set isValid=0" +
            " where deviceId=#{deviceId}")
    public int deviceDel(Device device);


}

