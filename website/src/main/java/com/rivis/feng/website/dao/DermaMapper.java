package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.Derma;
import com.rivis.feng.website.pojo.po.DermaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DermaMapper {
    int countByExample(DermaExample example);

    int deleteByExample(DermaExample example);

    int deleteByPrimaryKey(Long dermaId);

    int insert(Derma record);

    int insertSelective(Derma record);

    List<Derma> selectByExample(DermaExample example);

    Derma selectByPrimaryKey(Long dermaId);

    int updateByExampleSelective(@Param("record") Derma record, @Param("example") DermaExample example);

    int updateByExample(@Param("record") Derma record, @Param("example") DermaExample example);

    int updateByPrimaryKeySelective(Derma record);

    int updateByPrimaryKey(Derma record);
}