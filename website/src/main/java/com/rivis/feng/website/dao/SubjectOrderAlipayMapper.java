package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SubjectOrderAlipay;
import com.rivis.feng.website.pojo.po.SubjectOrderAlipayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectOrderAlipayMapper {
    int countByExample(SubjectOrderAlipayExample example);

    int deleteByExample(SubjectOrderAlipayExample example);

    int deleteByPrimaryKey(Long orderAlipayId);

    int insert(SubjectOrderAlipay record);

    int insertSelective(SubjectOrderAlipay record);

    List<SubjectOrderAlipay> selectByExample(SubjectOrderAlipayExample example);

    SubjectOrderAlipay selectByPrimaryKey(Long orderAlipayId);

    int updateByExampleSelective(@Param("record") SubjectOrderAlipay record, @Param("example") SubjectOrderAlipayExample example);

    int updateByExample(@Param("record") SubjectOrderAlipay record, @Param("example") SubjectOrderAlipayExample example);

    int updateByPrimaryKeySelective(SubjectOrderAlipay record);

    int updateByPrimaryKey(SubjectOrderAlipay record);
}