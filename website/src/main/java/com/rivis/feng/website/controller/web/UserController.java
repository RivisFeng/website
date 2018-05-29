package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.AdminInDto;
import com.rivis.feng.website.pojo.dto.RegisterInDto;
import com.rivis.feng.website.service.AdminService;
import com.rivis.feng.website.service.UserService;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @Auther: Rivis
 * @Date: 2018/4/18 18:27
 * @Description:
 */
@RestController
@RequestMapping(value = "/website/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/loginIn")
    public ResultDataDto loginIn(LoginInDto loginInDto) {
        boolean flag = userService.loginIn(loginInDto);
        if (flag) {
            return ResultDataUtil.success();
        }
        return ResultDataUtil.error();
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ResultDataDto register(RegisterInDto registerInDto) {
        boolean flag = userService.register(registerInDto);
        if (flag) {
            return ResultDataUtil.success();
        }
        return ResultDataUtil.error();
    }

    @RequestMapping(value = "/addAdmin")
    public ResultDataDto addAdmin(AdminInDto adminInDto) {
        boolean flag = adminService.addAdmin(adminInDto);
        if (flag) {
            return ResultDataUtil.success();
        }
        return ResultDataUtil.error();
    }

    @RequestMapping(value = "/deleteAdmin")
    public ResultDataDto deleteAdmin(long adminId) {
        boolean flag = adminService.deleteAdmin(adminId);
        if (flag) {
            return ResultDataUtil.success();
        }
        return ResultDataUtil.error();
    }


}
