package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;

/**
 * 用户逻辑层接口
 *
 * @author Rivis
 * @date 2018-04-25
 * @despaction
 */
public interface UserService {

    /**
     * web用户登录
     *
     * @author Rivis
     * @param loginInDto {LoginInDto}
     * @return {ResultDataDto}
     */
    ResultDataDto loginIn(LoginInDto loginInDto);
}