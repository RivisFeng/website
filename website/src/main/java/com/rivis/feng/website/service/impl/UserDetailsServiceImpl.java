package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.dao.UserMapper;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.po.User;
import com.rivis.feng.website.pojo.po.UserExample;
import com.rivis.feng.website.pojo.po.UserExample.Criteria;
import com.rivis.feng.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUserPhoneEqualTo(userName);
        List<User> user = userMapper.selectByExample(userExample);
        if (user == null && user.size() > 0) {
            throw new UsernameNotFoundException("user " + userName + " not found");
        }
        return new UserDetailsServiceImpl(user);
    }
}
