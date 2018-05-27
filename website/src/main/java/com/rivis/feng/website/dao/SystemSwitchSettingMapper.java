package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SystemSwitchSetting;
import com.rivis.feng.website.pojo.po.SystemSwitchSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemSwitchSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int countByExample(SystemSwitchSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int deleteByExample(SystemSwitchSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int deleteByPrimaryKey(Long switchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int insert(SystemSwitchSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int insertSelective(SystemSwitchSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    List<SystemSwitchSetting> selectByExample(SystemSwitchSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    SystemSwitchSetting selectByPrimaryKey(Long switchId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") SystemSwitchSetting record, @Param("example") SystemSwitchSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByExample(@Param("record") SystemSwitchSetting record, @Param("example") SystemSwitchSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByPrimaryKeySelective(SystemSwitchSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_switch_setting
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByPrimaryKey(SystemSwitchSetting record);
}