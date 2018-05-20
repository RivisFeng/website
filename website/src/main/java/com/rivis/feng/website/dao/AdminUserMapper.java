package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.AdminUser;
import com.rivis.feng.website.pojo.po.AdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int countByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByPrimaryKey(Long adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insert(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insertSelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    List<AdminUser> selectByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    AdminUser selectByPrimaryKey(Long adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKey(AdminUser record);
}