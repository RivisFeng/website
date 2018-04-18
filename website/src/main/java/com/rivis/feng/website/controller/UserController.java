package com.rivis.feng.website.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Rivis
 * @Date: 2018/4/18 18:27
 * @Description:
 */
@RestController
@RequestMapping(value = "website/user")
public class UserController {

    @RequestMapping(value = "loginIn")
    public String loginIn() {
        return "Hello Rivis.Feng!";
    }
}
