package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SystemRole;
import com.rivis.feng.website.pojo.po.SystemRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int countByExample(SystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int deleteByExample(SystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int deleteByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int insert(SystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int insertSelective(SystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    List<SystemRole> selectByExample(SystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    SystemRole selectByPrimaryKey(Long roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") SystemRole record, @Param("example") SystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int updateByExample(@Param("record") SystemRole record, @Param("example") SystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int updateByPrimaryKeySelective(SystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_role
     *
     * @mbggenerated Sun Jun 03 15:46:16 CST 2018
     */
    int updateByPrimaryKey(SystemRole record);
}