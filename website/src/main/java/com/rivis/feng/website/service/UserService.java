package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.RegisterInDto;
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
     * @return {boolean}
     */
    boolean loginIn(LoginInDto loginInDto);

    /**
     * 用户注册
     *
     * @author Rivis
     * @return registerInDto {RegisterInDto}
     * @param {boolean}
     */
    boolean register(RegisterInDto registerInDto);
}
