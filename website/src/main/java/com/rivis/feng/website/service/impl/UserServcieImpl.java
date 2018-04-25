package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.service.UserService;
import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.dao.UserMapper;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import com.rivis.feng.website.pojo.po.User;
import com.rivis.feng.website.pojo.po.UserExample;
import com.rivis.feng.website.pojo.po.UserExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServcieImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * web用户登录
     *
     * @param loginInDto {LoginInDto}
     * @return {ResultDataDto}
     * @author Rivis
     */
    @Override
    public ResultDataDto loginIn(LoginInDto loginInDto) {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUserPhoneEqualTo(loginInDto.getUserPhone());
        criteria.andUserPasswordEqualTo(loginInDto.getUserPassword());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() > 0) {
            return ResultDataUtil.success();
        }
        return null;
    }
}
