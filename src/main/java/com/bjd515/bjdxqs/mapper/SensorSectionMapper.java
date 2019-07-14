package com.bjd515.bjdxqs.mapper;

import com.bjd515.bjdxqs.model.SensorSection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SensorSectionMapper {
    @Select("SELECT sectionId,sectionName,IsValid,SDesc FROM t_location_section")
    public List<SensorSection> getSectionList();
    @Select("SELECT COUNT(*) from t_location_section")
    public int getSectionListTotal();
}
