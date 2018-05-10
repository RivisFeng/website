package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumAppraiseReply;
import com.rivis.feng.website.pojo.po.CurriculumAppraiseReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumAppraiseReplyMapper {
    int countByExample(CurriculumAppraiseReplyExample example);

    int deleteByExample(CurriculumAppraiseReplyExample example);

    int deleteByPrimaryKey(Long replyId);

    int insert(CurriculumAppraiseReply record);

    int insertSelective(CurriculumAppraiseReply record);

    List<CurriculumAppraiseReply> selectByExample(CurriculumAppraiseReplyExample example);

    CurriculumAppraiseReply selectByPrimaryKey(Long replyId);

    int updateByExampleSelective(@Param("record") CurriculumAppraiseReply record, @Param("example") CurriculumAppraiseReplyExample example);

    int updateByExample(@Param("record") CurriculumAppraiseReply record, @Param("example") CurriculumAppraiseReplyExample example);

    int updateByPrimaryKeySelective(CurriculumAppraiseReply record);

    int updateByPrimaryKey(CurriculumAppraiseReply record);
}