package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumVideo;
import com.rivis.feng.website.pojo.po.CurriculumVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumVideoMapper {
    int countByExample(CurriculumVideoExample example);

    int deleteByExample(CurriculumVideoExample example);

    int deleteByPrimaryKey(Long videoId);

    int insert(CurriculumVideo record);

    int insertSelective(CurriculumVideo record);

    List<CurriculumVideo> selectByExample(CurriculumVideoExample example);

    CurriculumVideo selectByPrimaryKey(Long videoId);

    int updateByExampleSelective(@Param("record") CurriculumVideo record, @Param("example") CurriculumVideoExample example);

    int updateByExample(@Param("record") CurriculumVideo record, @Param("example") CurriculumVideoExample example);

    int updateByPrimaryKeySelective(CurriculumVideo record);

    int updateByPrimaryKey(CurriculumVideo record);
}