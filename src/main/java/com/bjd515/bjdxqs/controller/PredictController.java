package com.bjd515.bjdxqs.controller;

import com.bjd515.bjdxqs.Vo.DataVO;
import com.bjd515.bjdxqs.Vo.ResultVO;
import com.bjd515.bjdxqs.dto.PredictDTO;
import com.bjd515.bjdxqs.service.PredictService;
import com.bjd515.bjdxqs.utils.FileOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * User: zhaoyang
 * Date: 2019/8/20
 * Time: 19:07
 * Description:
 *
 *
 */
@RestController
public class PredictController {

    @Autowired
    private PredictService predictService;

    @PostMapping("/getPredictData")
    public ResultVO getPredictData(PredictDTO params){
        ResultVO result = new ResultVO();
        DataVO dataVO = new DataVO();
        dataVO.setData(predictService.getPredictData(params));
        result.setCode(0);
        result.setMsg("数据获取成功");
        result.setResult(dataVO);
        return result;
    }

    @PostMapping("uploadFile")
    public File uploadFile(MultipartFile file){
        ResultVO result = new ResultVO();
        // 将file保存到服务器
        File rsFile = FileOp.saveModelOnLocal(file);
        return rsFile;
    }
}
