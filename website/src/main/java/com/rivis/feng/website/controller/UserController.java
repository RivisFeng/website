package com.rivis.feng.website.controller;

import com.rivis.feng.website.pojo.po.User;
import org.springframework.ui.Model;
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
    public String loginIn(Model model) {
        User user = new User();
        user.setUserName("rivis");
        user.setUserPassword("RivisFeng");
        model.addAttribute("user", user);
        return "home";
    }


}
