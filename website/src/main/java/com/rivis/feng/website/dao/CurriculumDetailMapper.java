package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumDetail;
import com.rivis.feng.website.pojo.po.CurriculumDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumDetailMapper {
    int countByExample(CurriculumDetailExample example);

    int deleteByExample(CurriculumDetailExample example);

    int deleteByPrimaryKey(Long detailId);

    int insert(CurriculumDetail record);

    int insertSelective(CurriculumDetail record);

    List<CurriculumDetail> selectByExample(CurriculumDetailExample example);

    CurriculumDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") CurriculumDetail record, @Param("example") CurriculumDetailExample example);

    int updateByExample(@Param("record") CurriculumDetail record, @Param("example") CurriculumDetailExample example);

    int updateByPrimaryKeySelective(CurriculumDetail record);

    int updateByPrimaryKey(CurriculumDetail record);
}