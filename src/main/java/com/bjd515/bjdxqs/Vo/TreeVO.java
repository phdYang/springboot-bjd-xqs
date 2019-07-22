package com.bjd515.bjdxqs.Vo;

import lombok.Data;

import java.util.List;

@Data
public class TreeVO {

    private String title;

    private String value;

    private String key;

    private List<TreeVO> children;
}
