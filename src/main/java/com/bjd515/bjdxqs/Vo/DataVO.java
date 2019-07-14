package com.bjd515.bjdxqs.Vo;


import lombok.Data;

import java.util.List;

@Data
public class DataVO<T> {

    private int total_count;

    private List<T> data;
}
