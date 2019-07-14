package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.SensorTarget;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SensorTargetMapper {
    @Select("SELECT targetId,targetName,IsValid,SDesc FROM t_sensor_target")
    public List<SensorTarget> getTargetList();
    @Select("SELECT COUNT(*) from t_sensor_target")
    public int getTargetListTotal();
}
