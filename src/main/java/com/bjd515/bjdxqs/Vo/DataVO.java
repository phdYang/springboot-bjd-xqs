package com.bjd515.bjdxqs.Vo;

import com.bjd515.bjdxqs.model.SensorType;
import lombok.Data;

import java.util.List;

@Data
public class DataVO {

    private int total_count;

    private List<SensorType> data;
}
