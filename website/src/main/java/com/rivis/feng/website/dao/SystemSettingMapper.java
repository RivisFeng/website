package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SystemSetting;
import com.rivis.feng.website.pojo.po.SystemSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemSettingMapper {
    int countByExample(SystemSettingExample example);

    int deleteByExample(SystemSettingExample example);

    int deleteByPrimaryKey(Long settingId);

    int insert(SystemSetting record);

    int insertSelective(SystemSetting record);

    List<SystemSetting> selectByExample(SystemSettingExample example);

    SystemSetting selectByPrimaryKey(Long settingId);

    int updateByExampleSelective(@Param("record") SystemSetting record, @Param("example") SystemSettingExample example);

    int updateByExample(@Param("record") SystemSetting record, @Param("example") SystemSettingExample example);

    int updateByPrimaryKeySelective(SystemSetting record);

    int updateByPrimaryKey(SystemSetting record);
}