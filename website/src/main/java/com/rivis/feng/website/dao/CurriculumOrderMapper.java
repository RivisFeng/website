package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumOrder;
import com.rivis.feng.website.pojo.po.CurriculumOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int countByExample(CurriculumOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByExample(CurriculumOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insert(CurriculumOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insertSelective(CurriculumOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    List<CurriculumOrder> selectByExample(CurriculumOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    CurriculumOrder selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExampleSelective(@Param("record") CurriculumOrder record, @Param("example") CurriculumOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExample(@Param("record") CurriculumOrder record, @Param("example") CurriculumOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKeySelective(CurriculumOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_order
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKey(CurriculumOrder record);
}