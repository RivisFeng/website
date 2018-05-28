package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.common.constant.SystemConstants;
import com.rivis.feng.website.common.enums.UserEnum;
import com.rivis.feng.website.common.exception.UserException;
import com.rivis.feng.website.common.util.DateUtil;
import com.rivis.feng.website.common.util.StringUtil;
import com.rivis.feng.website.dao.AdminUserMapper;
import com.rivis.feng.website.pojo.dto.AdminInDto;
import com.rivis.feng.website.pojo.po.AdminUser;
import com.rivis.feng.website.pojo.po.AdminUserExample;
import com.rivis.feng.website.pojo.po.AdminUserExample.Criteria;
import com.rivis.feng.website.pojo.query.AdminQuery;
import com.rivis.feng.website.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 管理员业务逻辑
 *
 * @author Rivis
 * @date 2018/05/28
 */
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    /**
     * 添加管理员
     *
     * @param adminInDto {AdminInDto}
     * @return {boolean}
     * @author Rivis
     * @date 2018/05/28
     */
    @Override
    public boolean addAdmin(AdminInDto adminInDto) {
        if (StringUtil.stringIsNull(adminInDto.getUserId().toString())) {
            throw new UserException(UserEnum.USER_ID_IS_NULL.getCode(),
                    UserEnum.USER_ID_IS_NULL.getMessage());
        }
        if (StringUtil.stringIsNull(adminInDto.getAdminType())) {
            throw new UserException(UserEnum.ADMIN_TYPE_IS_NULL.getCode(),
                    UserEnum.ADMIN_TYPE_IS_NULL.getMessage());
        }
        if (StringUtil.stringIsNull(adminInDto.getAdminState())) {
            throw new UserException(UserEnum.ADMIN_STATE_IS_NULL.getCode(),
                    UserEnum.ADMIN_STATE_IS_NULL.getMessage());
        }
        return createAdminUser(null, adminInDto.getUserId(), adminInDto.getAdminType(),
                adminInDto.getAdminState());
    }

    /**
     * 删除管理员
     *
     * @param param {Long}
     * @return {boolean}
     * @author Rivis
     * @date 2018/05/28
     */
    @Override
    public boolean deleteAdmin(Long param) {
        if (StringUtil.stringIsNull(param.toString())) {
            throw new UserException(UserEnum.ADMIN_STATE_IS_NULL.getCode(),
                    UserEnum.ADMIN_STATE_IS_NULL.getMessage());
        }
        AdminUser adminUser = new AdminUser();
        adminUser.setAdminId(param);

        return delete(adminUser);
    }

    /**
     * 更新管理员
     *
     * @param adminInDto {AdminInDto}
     * @return {boolean}
     * @author Rivis
     * @date 2018/05/28
     */
    @Override
    public boolean updateAdmin(AdminInDto adminInDto) {
        if (StringUtil.stringIsNull(adminInDto.getAdminId().toString())) {
            throw new UserException(UserEnum.USER_ID_IS_NULL.getCode(),
                    UserEnum.USER_ID_IS_NULL.getMessage());
        }
        if (StringUtil.stringIsNull(adminInDto.getUserId().toString())) {
            throw new UserException(UserEnum.USER_ID_IS_NULL.getCode(),
                    UserEnum.USER_ID_IS_NULL.getMessage());
        }
        if (StringUtil.stringIsNull(adminInDto.getAdminType())) {
            throw new UserException(UserEnum.ADMIN_TYPE_IS_NULL.getCode(),
                    UserEnum.ADMIN_TYPE_IS_NULL.getMessage());
        }
        if (StringUtil.stringIsNull(adminInDto.getAdminState())) {
            throw new UserException(UserEnum.ADMIN_ID_IS_NULL.getCode(),
                    UserEnum.ADMIN_ID_IS_NULL.getMessage());
        }
        return createAdminUser(adminInDto.getAdminId(), adminInDto.getUserId(), adminInDto.getAdminType(),
                adminInDto.getAdminState());
    }

    /**
     * 查询管理员
     *
     * @param param {Long}
     * @return {boolean}
     * @author Rivis
     * @date 2018/05/28
     */
    @Override
    public AdminUser selectAdmin(Long param) {
        if (StringUtil.stringIsNull(param.toString())) {
            throw new UserException(UserEnum.USER_ID_IS_NULL.getCode(),
                    UserEnum.USER_ID_IS_NULL.getMessage());
        }
        AdminUser adminUser = new AdminUser();
        return select(adminUser).get(0);
    }

    /**
     * 查询所有管理员
     *
     * @param adminQuery {AdminQuery}
     * @return {boolean}
     * @author Rivis
     * @date 2018/05/28
     */
    @Override
    public List<AdminUser> listAdmin(AdminQuery adminQuery) {
        if (StringUtil.stringIsNull(adminQuery.getAdminId().toString())) {
            throw new UserException(UserEnum.ADMIN_ID_IS_NULL.getCode(),
                    UserEnum.ADMIN_ID_IS_NULL.getMessage());
        }
        AdminUser adminUser = new AdminUser();
        return select(adminUser);
    }

    /**
     * 创建用户实体类
     *
     * @author Rivis
     * @param userId {Long} 用户ID
     * @param adminType {String} 管理员类型
     * @return {boolean} 返回的结果
     */
    private boolean createAdminUser(Long userId,
                                    String adminType) {
        return createAdminUser(StringUtil.createPrimaryKey(), userId, adminType);
    }

    /**
     * 创建用户实体类
     *
     * @author Rivis
     * @param adminUserId {Long} 管理员ID
     * @param userId {Long} 用户ID
     * @param adminType {String} 管理员类型
     * @return {boolean} 返回的结果
     */
    private boolean createAdminUser(Long adminUserId, Long userId,
                                    String adminType) {
        return createAdminUser(adminUserId, userId, adminType,
                SystemConstants.ENCRYPT_NUMBER_ONE);
    }

    /**
     * 创建用户实体类
     *
     * @author Rivis
     * @param adminUserId {Long} 管理员ID
     * @param userId {Long} 用户ID
     * @param adminType {String} 管理员类型
     * @param adminState {String} 管理员状态
     * @return {boolean} 返回的结果
     */
    private boolean createAdminUser(Long adminUserId, Long userId,
                                    String adminType, String adminState) {
        return createAdminUser(adminUserId, userId, adminType, adminState, new Date());
    }

    /**
     * 创建用户实体类
     *
     * @author Rivis
     * @param adminUserId {Long} 管理员ID
     * @param userId {Long} 用户ID
     * @param adminType {String} 管理员类型
     * @param adminState {String} 管理员状态
     * @param adminCreateTime {Date} 管理员创建时间
     * @return {boolean} 返回的结果
     */
    private boolean createAdminUser(Long adminUserId, Long userId,
                                    String adminType, String adminState, Date adminCreateTime) {
        boolean flag = false;

        // 获取
        AdminUser adminUser = getAdminUser(adminUserId, userId, adminType, adminState, adminCreateTime);

        return insertOrUpdate(adminUser);
    }

    private boolean insertOrUpdate(AdminUser adminUser) {
        int flag = 0;
        AdminUser temp = adminUserMapper.selectByPrimaryKey(adminUser.getAdminId());
        if (temp == null) {
            flag = adminUserMapper.insert(adminUser);
        } else {
            flag = adminUserMapper.updateByPrimaryKey(adminUser);
        }
        return flag > 0;
    }

    private boolean delete(AdminUser adminUser) {
        int flag = 0;

        AdminUserExample adminUserExample = getExample(adminUser);

        flag = adminUserMapper.deleteByExample(adminUserExample);

        return flag > 0;
    }

    private List<AdminUser> select(AdminUser adminUser) {
        AdminUserExample adminUserExample = getExample(adminUser);

        List<AdminUser> adminUserList = adminUserMapper.selectByExample(adminUserExample);

        return adminUserList;
    }

    private AdminUser getAdminUser(Long adminUserId, Long userId,
                                   String adminType, String adminState, Date adminCreateTime) {
        AdminUser adminUser = new AdminUser();
        if (!StringUtil.stringIsNull(adminUserId.toString())) {
            adminUser.setAdminId(adminUserId);
        } else {
            adminUser.setAdminId(StringUtil.createPrimaryKey());
        }
        if (!StringUtil.stringIsNull(userId.toString())) {
            adminUser.setAdminUserId(userId);
        }
        if (!StringUtil.stringIsNull(adminType)) {
            adminUser.setAdminType(StringUtil.encrypt(adminType));
        }
        if (!StringUtil.stringIsNull(adminState)) {
            adminUser.setAdminState(StringUtil.encrypt(adminState));
        } else {
            adminUser.setAdminState(SystemConstants.ENCRYPT_NUMBER_ONE);
        }
        if (!DateUtil.dateIsNull(adminCreateTime)) {
            adminUser.setAdminCreateTime(adminCreateTime);
        }
        return adminUser;
    }

    private AdminUserExample getExample(AdminUser adminUser) {
        AdminUserExample adminUserExample = new AdminUserExample();
        Criteria criteria = adminUserExample.createCriteria();
        if (!StringUtil.stringIsNull(adminUser.getAdminId().toString())) {
            criteria.andAdminIdEqualTo(adminUser.getAdminId());
        }
        if (!StringUtil.stringIsNull(adminUser.getAdminUserId().toString())) {
            criteria.andAdminUserIdEqualTo(adminUser.getAdminUserId());
        }
        if (!StringUtil.stringIsNull(adminUser.getAdminType())) {
            criteria.andAdminTypeEqualTo(StringUtil.encrypt(adminUser.getAdminType()));
        }
        if (!StringUtil.stringIsNull(adminUser.getAdminState())) {
            criteria.andAdminStateEqualTo(StringUtil.encrypt(adminUser.getAdminState()));
        }
        if (!DateUtil.dateIsNull(adminUser.getAdminCreateTime())) {
            criteria.andAdminCreateTimeEqualTo(adminUser.getAdminCreateTime());
        }
        return adminUserExample;
    }

}
