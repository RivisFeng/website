package com.rivis.feng.website.common.handle;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rivis.feng.website.common.util.ResultDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("AuthenctiationSuccessHandle")
public class AuthenctiationSuccessHandle extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException,ServletException {
        System.err.println("登录成功！");

        response.setContentType("/application/json;charset=UTF-8");
        response.getWriter().write(
                objectMapper.writeValueAsString(ResultDataUtil.success(authentication)));
    }
}
