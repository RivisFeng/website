package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.common.constant.SystemConstants;
import com.rivis.feng.website.common.constant.UserConstants;
import com.rivis.feng.website.common.enums.UserEnum;
import com.rivis.feng.website.common.exception.UserException;
import com.rivis.feng.website.common.util.DateUtil;
import com.rivis.feng.website.common.util.StringUtil;
import com.rivis.feng.website.dao.UserMapper;
import com.rivis.feng.website.pojo.dto.RegisterInDto;
import com.rivis.feng.website.pojo.po.User;
import com.rivis.feng.website.pojo.po.UserExample;
import com.rivis.feng.website.pojo.po.UserExample.Criteria;
import com.rivis.feng.website.service.UserService;
import com.rivis.feng.website.common.util.ResultDataUtil;
import com.rivis.feng.website.pojo.dto.LoginInDto;
import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 用户逻辑层
 *
 * @author Rivis
 * @date 2018-04-25
 * @despaction
 */
@Service
public class UserServiceImpl implements UserService {

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
    public boolean loginIn(LoginInDto loginInDto) {
        UserExample userExample = new UserExample();
        Criteria criteria = userExample.createCriteria();
        criteria.andUserPhoneEqualTo(loginInDto.getUserPhone());
        criteria.andUserPasswordEqualTo(loginInDto.getUserPassword());
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 用户注册
     *
     * @author Rivis
     * @param registerInDto {RegisterInDto}
     * @return {ResultDataDto}
     */
    @Override
    public boolean register(RegisterInDto registerInDto) throws UserException {
        Boolean flag = false;
        // 验证手机号码手否为空
        if (StringUtil.stringIsNull(registerInDto.getUserPhone())) {
            throw new UserException(UserEnum.USER_PHONE_IS_NULL.getCode(),
                    UserEnum.USER_PHONE_IS_NULL.getMessage());
        }
        // 验证用户输入的手机号码是否是手机号码
        if (StringUtil.checkPhone(registerInDto.getUserPhone())) {
            throw new UserException(UserEnum.PHONE_IS_NOT_PHONE.getCode(),
                    UserEnum.PHONE_IS_NOT_PHONE.getMessage());
        }
        // 验证用户注册平台是否为空
        if (StringUtil.stringIsNull(registerInDto.getUserFrom())) {
            throw new UserException(UserEnum.USER_REGISTER_IS_NULL.getCode(),
                    UserEnum.USER_REGISTER_IS_NULL.getMessage());
        }
        // 验证用户输入密码是否为空
        if (StringUtil.stringIsNull(registerInDto.getUserPassword())) {
            throw new UserException(UserEnum.USER_PASSWORD_IS_NULL.getCode(),
                    UserEnum.USER_PASSWORD_IS_NULL.getMessage());
        }
        // 验证用户第二次输入密码是否为空
        if (StringUtil.stringIsNull(registerInDto.getUserCheckPassword())) {
            throw new UserException(UserEnum.USER_PASSWORD_IS_NULL.getCode(),
                    UserEnum.USER_PASSWORD_IS_NULL.getMessage());
        }
        // 验证用户两次输入的密码是否一致
        if (!registerInDto.getUserPassword().equals(registerInDto.getUserCheckPassword())) {
            throw new UserException(UserEnum.USER_PASSWORD_CHECK_ERROR.getCode(),
                    UserEnum.USER_PASSWORD_CHECK_ERROR.getMessage());
        }

        try {
            flag = createUser(registerInDto.getUserName(), registerInDto.getUserPhone(),
                    registerInDto.getUserPassword(), registerInDto.getUserBirthday(),
                    registerInDto.getUserPicture(), registerInDto.getUserGender(),
                    registerInDto.getUserCityId(), registerInDto.getUserAddress(),
                    registerInDto.getUserMail(), registerInDto.getUserFrom());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    /**
     * 创建要插入或更新数据库的用户对象
     *
     * @author Rivis
     * @param userName {String} 用户姓名
     * @param userPhone {String} 用户手机
     * @param userPassword {String} 用户密码
     * @param userBirthday {String} 用户生日
     * @param userPicture {String} 用户头像
     * @param userGender {String} 用户性别
     * @param userCity {Long} 用户所在城市
     * @param userAddress {String} 用户详细地址
     * @param userMail {String} 用户电子邮箱
     * @param userFrom {String} 用户注册平台来源
     * @return {Boolean} 返回的结果
     * @throws Exception 可能会抛出的异常
     */
    private Boolean createUser(String userName, String userPhone, String userPassword,
                               String userBirthday, String userPicture, String userGender,
                               Long userCity, String userAddress, String userMail,
                               String userFrom) throws Exception {
        return createUser(StringUtil.createPrimaryKey(), userName, userPhone, userPassword,
                userPicture, userGender, userBirthday, userCity, userAddress, userMail,
                userFrom, UserConstants.USER_NO_DELETE, UserConstants.USER_NO_VIP, new Date());
    }

    /**
     * 创建要插入或更新数据库的用户对象
     *
     * @author Rivis
     * @param userId {Long} 用户ID
     * @param userName {String} 用户姓名
     * @param userPhone {String} 用户手机
     * @param userPassword {String} 用户密码
     * @param userPicture {String} 用户头像
     * @param userGender {String} 用户性别
     * @param userBirthday {Date} 用户生日
     * @param userCity {Long} 用户所在城市
     * @param userAddress {String} 用户详细地址
     * @param userMail {String} 用户电子邮箱
     * @param userFrom {String} 用户注册平台来源
     * @param userIsDelete {String} 用户是否注销
     * @param userIsVip {String} 用户是否是VIP
     * @return {Boolean} 返回的结果
     * @throws Exception 可能会抛出的异常
     * @date 2018/04/27
     */
    private Boolean createUser(Long userId, String userName, String userPhone, String userPassword,
                               String userPicture, String userGender, String userBirthday,
                               Long userCity, String userAddress, String userMail, String userFrom,
                               String userIsDelete, String userIsVip, Date userCreateTime) throws Exception {
        // 创建一个用户对象
        User user = new User();
        // 判断用户名是否为空
        if (!StringUtil.stringIsNull(userName)) {
            user.setUserName(StringUtil.encrypt(userName));
        }
        // 判断用户手机号是否为空
        if (!StringUtil.stringIsNull(userPhone)) {
            user.setUserPhone(StringUtil.encrypt(userPhone));
        }
        // 判断用户密码是否为空
        if (!StringUtil.stringIsNull(userPassword)) {
            user.setUserPassword(StringUtil.userPasswordEncode(userPassword));
        }
        // 判断用户头像是否为空
        if (!StringUtil.stringIsNull(userPicture)) {
            // 不为空，在用户对象里放入用户头像
            user.setUserPicture(userPicture);
        }
        // 判断用户性别是否为空
        if (!StringUtil.stringIsNull(userGender)) {
            // 判断用户性别 0：女 1：男
            if (userGender.equals(UserConstants.USER_IS_MAN)) {
                // 该名用户为男性
                user.setUserGender(SystemConstants.ENCRYPT_NUMBER_ONE);
            } else {
                // 改名用户为女性
                user.setUserGender(SystemConstants.ENCRYPT_NUMBER_ZERO);
            }
        } else {
            // 默认该名用户为男性
            user.setUserGender(SystemConstants.ENCRYPT_NUMBER_ONE);
        }
        // 判断用户所在城市是否为空
        if (!StringUtil.stringIsNull(userCity.toString())) {
            user.setUserCityId(userCity);
        }
        // 判断用户详细住址是否为空
        if (!StringUtil.stringIsNull(userAddress)) {
            user.setUserAddress(StringUtil.encrypt(userAddress));
        }
        // 判断用户来源是否为空
        if (!StringUtil.stringIsNull(userFrom)) {
            user.setUserFrom(StringUtil.encrypt(userFrom));
        }
        // 判断用户是否状态是否为空
        if (!StringUtil.stringIsNull(userIsDelete)) {
            if (StringUtil.stringIsEquals(userIsDelete, UserConstants.USER_NO_DELETE)) {
                user.setUserIsDelete(SystemConstants.ENCRYPT_NUMBER_ONE);
            } else {
                user.setUserIsDelete(SystemConstants.ENCRYPT_NUMBER_ZERO);
            }
        }
        // 判断用户VIP信息是否为空
        if (!StringUtil.stringIsNull(userIsVip)) {
            if (StringUtil.stringIsEquals(userIsVip, UserConstants.USER_NO_VIP)) {
                user.setUserIsVip(SystemConstants.ENCRYPT_NUMBER_ZERO);
            } else {
                user.setUserIsVip(SystemConstants.ENCRYPT_NUMBER_ONE);
            }
        }
        // 判断用户ID是否为空
        if (userId == null) {
            user.setUserId(userId);
        } else {
            user.setUserId(StringUtil.createPrimaryKey());
        }
        // 判断用户电子邮箱是否为空
        if (!StringUtil.stringIsNull(userMail)) {
            // 用户电子邮箱
            user.setUserMail(StringUtil.encrypt(userMail));
        }
        // 判断用户生日是否为空
        if (!StringUtil.stringIsNull(userBirthday)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SystemConstants.DATE_FORMAT);
            user.setUserBirthday(simpleDateFormat.parse(userBirthday));
        } else {
            user.setUserBirthday(new Date());
        }
        if (!DateUtil.dateIsNull(userCreateTime)) {
            user.setUserCreateTime(userCreateTime);
        }

        return insertOrUpdate(user);
    }

    /**
     * 插入或更新用户
     *
     * @author Rivis
     * @param user {User} 等待操作数据库的对象
     * @return {Boolean} 返回的结果
     */
    private Boolean insertOrUpdate(User user) {
        int flag = 0;

        User tempUser = userMapper.selectByPrimaryKey(user.getUserId());
        if (tempUser == null) {
            System.err.println(user.toString());
            flag = userMapper.insert(user);
        } else {
            flag = userMapper.updateByPrimaryKey(user);
        }

        return flag > 0;
    }
}
