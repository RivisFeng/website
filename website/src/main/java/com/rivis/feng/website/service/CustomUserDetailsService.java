package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rivis
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private HttpServletRequest request;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUserName("rivis");
        user.setUserPassword("RivisFeng");
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在或密码不正确！");
        }
        HttpSession httpSession = request.getSession();
        request.setAttribute("user", user);
        request.setAttribute("userName", user.getUserName());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.userdetails
                .User(user.getUserName(), user.getUserPassword(), authorities);
    }
}
