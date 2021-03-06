package com.rivis.feng.website.dao;

import com.rivis.feng.website.pojo.po.CurriculumLecture;
import com.rivis.feng.website.pojo.po.CurriculumLectureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumLectureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int countByExample(CurriculumLectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByExample(CurriculumLectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int deleteByPrimaryKey(Long lectureId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insert(CurriculumLecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int insertSelective(CurriculumLecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    List<CurriculumLecture> selectByExample(CurriculumLectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    CurriculumLecture selectByPrimaryKey(Long lectureId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExampleSelective(@Param("record") CurriculumLecture record, @Param("example") CurriculumLectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByExample(@Param("record") CurriculumLecture record, @Param("example") CurriculumLectureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKeySelective(CurriculumLecture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table curriculum_lecture
     *
     * @mbggenerated Sat May 19 23:25:22 CST 2018
     */
    int updateByPrimaryKey(CurriculumLecture record);
}