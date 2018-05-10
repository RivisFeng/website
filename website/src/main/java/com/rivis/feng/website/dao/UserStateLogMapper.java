package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.UserStateLog;
import com.rivis.feng.website.pojo.po.UserStateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStateLogMapper {
    int countByExample(UserStateLogExample example);

    int deleteByExample(UserStateLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(UserStateLog record);

    int insertSelective(UserStateLog record);

    List<UserStateLog> selectByExample(UserStateLogExample example);

    UserStateLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") UserStateLog record, @Param("example") UserStateLogExample example);

    int updateByExample(@Param("record") UserStateLog record, @Param("example") UserStateLogExample example);

    int updateByPrimaryKeySelective(UserStateLog record);

    int updateByPrimaryKey(UserStateLog record);
}