package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumAppraise;
import com.rivis.feng.website.pojo.po.CurriculumAppraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumAppraiseMapper {
    int countByExample(CurriculumAppraiseExample example);

    int deleteByExample(CurriculumAppraiseExample example);

    int deleteByPrimaryKey(Long appraiseId);

    int insert(CurriculumAppraise record);

    int insertSelective(CurriculumAppraise record);

    List<CurriculumAppraise> selectByExample(CurriculumAppraiseExample example);

    CurriculumAppraise selectByPrimaryKey(Long appraiseId);

    int updateByExampleSelective(@Param("record") CurriculumAppraise record, @Param("example") CurriculumAppraiseExample example);

    int updateByExample(@Param("record") CurriculumAppraise record, @Param("example") CurriculumAppraiseExample example);

    int updateByPrimaryKeySelective(CurriculumAppraise record);

    int updateByPrimaryKey(CurriculumAppraise record);
}