package com.bjd515.bjdxqs.mapper;


import com.bjd515.bjdxqs.model.SensorItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Mapper
public interface SensorItemMapper {
    @Select("SELECT itemId,itemName,isValid,sDesc from t_sensor_Item")
    public List<SensorItem> getItemList();
    @Select("SELECT COUNT(*) from t_sensor_Item")
    public int getItemListTotal();
}
