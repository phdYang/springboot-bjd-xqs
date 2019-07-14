package com.bjd515.bjdxqs.mapper;


import com.bjd515.bjdxqs.model.SensorType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SensorTypeMapper {
    @Select("SELECT typeid,typeName,unit,isValid,sDesc from t_sensor_type")
    public List<SensorType> getTypeList();
    @Select("SELECT COUNT(*) from t_sensor_type")
    public int getTypeListTotal();
}
