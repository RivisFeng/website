package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.AdminInDto;
import com.rivis.feng.website.pojo.dto.RegisterInDto;
import com.rivis.feng.website.service.AdminService;
import com.rivis.feng.website.service.UserService;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    /*@RequestMapping(value = "/retur")
    @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
    public ResultDataDto check(HttpServletRequest request, HttpServletResponse response) {
        SavedRequest savedRequest = requestCache.getRequest(request, response);

        if (savedRequest != null) {
            String targetUrl = savedRequest.getRedirectUrl();
            System.err.println("引发跳转的请求是：" + targetUrl);
            if (StringUtils.endsWithIgnoreCase(targetUrl, ".html")) {
                try {
                    redirectStrategy.sendRedirect(request, response, "/login.html");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return ResultDataUtil.error();
        }
    }*/

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
