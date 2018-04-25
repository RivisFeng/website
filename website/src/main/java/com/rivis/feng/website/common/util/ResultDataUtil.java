package com.rivis.feng.website.common.util;

import com.rivis.feng.website.common.enums.BaseEnum;
import com.rivis.feng.website.pojo.dto.ResultDataDto;

/**
 * 结果工具类
 *
 * @author Rivis
 * @date 2018-04-25
 * @despecation
 */
public class ResultDataUtil {

    /**
     * 成功
     *
     * @author Rivis
     * @return {ResultDataDto}
     */
    public static ResultDataDto success() {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.SUCCESS.getCode());
        resultDataDto.setMessage(BaseEnum.SUCCESS.getMessage());
        return resultDataDto;
    }

    /**
     * 成功
     *
     * @author Rivis
     * @param result {Object}
     * @return {ResultDataDto}
     */
    public static ResultDataDto success(Object result) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.SUCCESS.getCode());
        resultDataDto.setMessage(BaseEnum.SUCCESS.getMessage());
        resultDataDto.setResult(result);
        return resultDataDto;
    }

    /**
     * 成功
     *
     * @author Rivis
     * @param code {Integer}
     * @param message {String}
     * @param result {Object}
     * @return {ResultDataDto}
     */
    public static ResultDataDto success(Integer code, String message, Object result) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(code);
        resultDataDto.setMessage(message);
        resultDataDto.setResult(result);
        return resultDataDto;
    }

    /**
     * 失败
     *
     * @author Rivis
     * @return {ResultDataDto}
     */
    public static ResultDataDto error() {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(BaseEnum.ERROR.getCode());
        resultDataDto.setMessage(BaseEnum.ERROR.getMessage());
        return resultDataDto;
    }

    /**
     * 失败
     *
     * @author Rivis
     * @param code {Integer}
     * @param message {String}
     * @return {ResultDataDto}
     */
    public static ResultDataDto error(Integer code, String message) {
        ResultDataDto resultDataDto = new ResultDataDto();
        resultDataDto.setCode(code);
        resultDataDto.setMessage(message);
        return resultDataDto;
    }
}
