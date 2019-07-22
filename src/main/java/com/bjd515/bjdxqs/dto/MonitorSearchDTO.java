package com.bjd515.bjdxqs.dto;

import lombok.Data;

import java.util.List;

@Data
public class MonitorSearchDTO {

    private List<String> sensorItemId;

    private List<String> dataRange;
}
