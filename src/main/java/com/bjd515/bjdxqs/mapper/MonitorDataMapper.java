package com.bjd515.bjdxqs.mapper;


import com.bjd515.bjdxqs.model.MonitorData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MonitorDataMapper {

    @Select("SELECT MonitorValue,MonitorDate FROM t_monitordata_origin2014 WHERE MonitorDate >= #{begin} and MonitorDate <=#{end} and SensorId = #{sensorId} " +
            " UNION " +
            " SELECT MonitorValue,MonitorDate FROM t_monitordata_origin2015 WHERE MonitorDate >= #{begin} and MonitorDate <=#{end} and SensorId = #{sensorId} " +
            " UNION " +
            " SELECT MonitorValue,MonitorDate FROM t_monitordata_origin2016 WHERE MonitorDate >= #{begin} and MonitorDate <=#{end} and SensorId = #{sensorId} " +
            " UNION " +
            " SELECT MonitorValue,MonitorDate FROM t_monitordata_origin2017 WHERE MonitorDate >= #{begin} and MonitorDate <=#{end} and SensorId = #{sensorId} " +
            " UNION " +
            " SELECT MonitorValue,MonitorDate FROM t_monitordata_origin2018 WHERE MonitorDate >= #{begin} and MonitorDate <=#{end} and SensorId = #{sensorId} ")
    public List<MonitorData> getMonitorData(@Param("begin") String begin, @Param("end") String end, @Param("sensorId") String sensorId);
}
