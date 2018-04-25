package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;

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
