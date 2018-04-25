package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.Service.UserService;
import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Rivis
 * @Date: 2018/4/18 18:27
 * @Description:
 */
@RestController
@RequestMapping(value = "/website/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/loginIn", method = RequestMethod.POST)
    public ResultDataDto loginIn(LoginInDto loginInDto) {
        ResultDataDto resultDataDto = userService.loginIn(loginInDto);
        return ResultDataUtil.success(resultDataDto);
    }


}
