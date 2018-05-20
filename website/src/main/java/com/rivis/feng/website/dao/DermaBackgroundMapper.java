package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.DermaBackground;
import com.rivis.feng.website.pojo.po.DermaBackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DermaBackgroundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int countByExample(DermaBackgroundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int deleteByExample(DermaBackgroundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int deleteByPrimaryKey(Long backgroundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int insert(DermaBackground record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int insertSelective(DermaBackground record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    List<DermaBackground> selectByExample(DermaBackgroundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    DermaBackground selectByPrimaryKey(Long backgroundId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByExampleSelective(@Param("record") DermaBackground record, @Param("example") DermaBackgroundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByExample(@Param("record") DermaBackground record, @Param("example") DermaBackgroundExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByPrimaryKeySelective(DermaBackground record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table derma_background
     *
     * @mbggenerated Sat May 19 23:25:23 CST 2018
     */
    int updateByPrimaryKey(DermaBackground record);
}