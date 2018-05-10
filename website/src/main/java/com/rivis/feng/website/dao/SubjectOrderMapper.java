package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.SubjectOrder;
import com.rivis.feng.website.pojo.po.SubjectOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectOrderMapper {
    int countByExample(SubjectOrderExample example);

    int deleteByExample(SubjectOrderExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(SubjectOrder record);

    int insertSelective(SubjectOrder record);

    List<SubjectOrder> selectByExample(SubjectOrderExample example);

    SubjectOrder selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") SubjectOrder record, @Param("example") SubjectOrderExample example);

    int updateByExample(@Param("record") SubjectOrder record, @Param("example") SubjectOrderExample example);

    int updateByPrimaryKeySelective(SubjectOrder record);

    int updateByPrimaryKey(SubjectOrder record);
}