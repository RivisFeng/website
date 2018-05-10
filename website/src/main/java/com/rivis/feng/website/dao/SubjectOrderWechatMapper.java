package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SubjectOrderWechat;
import com.rivis.feng.website.pojo.po.SubjectOrderWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectOrderWechatMapper {
    int countByExample(SubjectOrderWechatExample example);

    int deleteByExample(SubjectOrderWechatExample example);

    int deleteByPrimaryKey(Long orderWechatId);

    int insert(SubjectOrderWechat record);

    int insertSelective(SubjectOrderWechat record);

    List<SubjectOrderWechat> selectByExample(SubjectOrderWechatExample example);

    SubjectOrderWechat selectByPrimaryKey(Long orderWechatId);

    int updateByExampleSelective(@Param("record") SubjectOrderWechat record, @Param("example") SubjectOrderWechatExample example);

    int updateByExample(@Param("record") SubjectOrderWechat record, @Param("example") SubjectOrderWechatExample example);

    int updateByPrimaryKeySelective(SubjectOrderWechat record);

    int updateByPrimaryKey(SubjectOrderWechat record);
}