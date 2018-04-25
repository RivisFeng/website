package com.rivis.feng.website.common.util;

import com.rivis.feng.website.common.enums.BaseEnum;
import com.rivis.feng.website.pojo.dto.ResultDataDto;

public class ResultDataUtil {

    public static ResultDataDto success() {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.SUCCESS.getCode());
        resultDataDto.setMessage(BaseEnum.SUCCESS.getMessage());
        return resultDataDto;
    }

    public static ResultDataDto success(Object result) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.SUCCESS.getCode());
        resultDataDto.setMessage(BaseEnum.SUCCESS.getMessage());
        resultDataDto.setResult(result);
        return resultDataDto;
    }

    public static ResultDataDto success(Integer code, String message, Object result) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(code);
        resultDataDto.setMessage(message);
        resultDataDto.setResult(result);
        return resultDataDto;
    }

    public static ResultDataDto error(Object result) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.ERROR.getCode());
        resultDataDto.setMessage(BaseEnum.ERROR.getMessage());
        return resultDataDto;
    }

    public static ResultDataDto error(Integer code, String message) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(code);
        resultDataDto.setMessage(message);
        return resultDataDto;
    }
}
