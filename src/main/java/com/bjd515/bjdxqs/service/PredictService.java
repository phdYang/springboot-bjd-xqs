package com.bjd515.bjdxqs.service;

import com.bjd515.bjdxqs.dto.PredictDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: zhaoyang
 * Date: 2019/8/20
 * Time: 19:12
 * Description: No Description
 */
@Service
public interface PredictService {


    public List getPredictData(PredictDTO params);
}
