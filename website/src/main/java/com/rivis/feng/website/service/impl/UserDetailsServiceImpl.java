package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.dao.UserMapper;
import com.rivis.feng.website.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        logger.info("username = {" + userName + "}");
        /*UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUserPhoneEqualTo(userName);
        List<User> user = userMapper.selectByExample(userExample);
        if (user == null && user.size() > 0) {
            throw new UsernameNotFoundException("user " + userName + " not found");
        }*/
        String password = passwordEncoder
                .encode("123456");
        User user = new User(userName, password,
                AuthorityUtils
                        .commaSeparatedStringToAuthorityList("admin"));

        return user;
    }
}
