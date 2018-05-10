package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumFeature;
import com.rivis.feng.website.pojo.po.CurriculumFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumFeatureMapper {
    int countByExample(CurriculumFeatureExample example);

    int deleteByExample(CurriculumFeatureExample example);

    int deleteByPrimaryKey(Long featureId);

    int insert(CurriculumFeature record);

    int insertSelective(CurriculumFeature record);

    List<CurriculumFeature> selectByExample(CurriculumFeatureExample example);

    CurriculumFeature selectByPrimaryKey(Long featureId);

    int updateByExampleSelective(@Param("record") CurriculumFeature record, @Param("example") CurriculumFeatureExample example);

    int updateByExample(@Param("record") CurriculumFeature record, @Param("example") CurriculumFeatureExample example);

    int updateByPrimaryKeySelective(CurriculumFeature record);

    int updateByPrimaryKey(CurriculumFeature record);
}