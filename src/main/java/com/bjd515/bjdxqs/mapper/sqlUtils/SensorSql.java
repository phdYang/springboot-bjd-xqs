package com.bjd515.bjdxqs.mapper.sqlUtils;

import com.bjd515.bjdxqs.model.Sensor;

public class SensorSql {

    public String getSensorByOtherSQL(Sensor sensor){
        String sql = "SELECT ts.SensorId,ts.SensorCode,ts.SensorName,tsty.typeName,tsta.targetName,tls.sectionName " +
                "FROM t_sensor as ts,t_sensor_type as tsty,t_sensor_target as tsta,t_location_section as tls " +
                "where ts.TypeId = tsty.typeId and ts.targetId = tsta.targetId and ts.sectionId = tls.sectionId and ts.isValid=1";
        if (sensor.getTargetId() != 0) sql += " and ts.targetId = #{targetId} ";
        if (sensor.getSectionId() != 0) sql += " and ts.sectionId = #{sectionId} ";
        if (sensor.getTypeId() != 0) sql += " and ts.typeId = #{typeId} ";
        return sql;
    }

    public String getSensorByOtherTotalSQL(Sensor sensor){
        String sql = "SELECT COUNT(*) FROM t_sensor as ts where ts.isValid=1 ";
        if (sensor.getTargetId() != 0) sql += " and ts.targetId = #{targetId} ";
        if (sensor.getSectionId() != 0) sql += " and ts.sectionId = #{sectionId} ";
        if (sensor.getTypeId() != 0) sql += " and ts.typeId = #{typeId} ";
        return sql;
    }
}
