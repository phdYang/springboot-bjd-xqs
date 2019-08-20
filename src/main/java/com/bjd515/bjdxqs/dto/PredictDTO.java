package com.bjd515.bjdxqs.dto;

import lombok.Data;

import java.util.List;

/**
 * User: zhaoyang
 * Date: 2019/8/20
 * Time: 19:09
 * Description: No Description
 */

@Data
public class PredictDTO {

    private List<String> sensorItemId;

    private Integer daysNum;

    private String modelPath;
}
