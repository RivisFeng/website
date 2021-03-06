package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.AdminInDto;
import com.rivis.feng.website.pojo.dto.RegisterInDto;
import com.rivis.feng.website.service.AdminService;
import com.rivis.feng.website.service.UserService;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
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

    // 原请求信息的缓存及恢复
    private RequestCache requestCache = new HttpSessionRequestCache();

    // 用于重定向
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

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
