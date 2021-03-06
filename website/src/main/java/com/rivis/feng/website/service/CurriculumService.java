package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.po.Curriculum;

import java.util.List;

/**
 * 课程业务逻辑接口
 *
 * @author Rivis
 * @date 2018/5/27 16:50
 */
public interface CurriculumService {

    /**
     * 添加课程
     *
     * @author Rivis
     * @param param {Object} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean addCurriculumByObject(Object param);

    /**
     * 添加课程
     *
     * @author Rivis
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean addCurriculumByCurriculumAny(Curriculum curriculum);

    /**
     * 查询课程列表
     *
     * @author Rivis
     * @param param {Object} 查询课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    List<Curriculum> listCurriculumByObject(Object param);

    /**
     * 查询课程列表
     *
     * @author Rivis
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    List<Curriculum> listCurriculumByCurriculumAny(Curriculum curriculum);

    /**
     * 删除课程
     *
     * @author Rivis
     * @param param {Object} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean deleteCurriculumByObject(Object param);

    /**
     * 根据ID删除课程
     *
     * @author Rivis
     * @param curriculumId {Long} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean deleteCurriculumById(Long curriculumId);

    /**
     * 根据课程条件删除相应课程
     *
     * @author Rivis
     * @param curriculum {Curriculum} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean deleteCurriculumByCurriculumAny(Curriculum curriculum);

    /**
     * 更新课程
     *
     * @author Rivis
     * @param param {Object} 需要更新的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean updateCurriculumByObject(Object param);

    /**
     * 更新课程
     *
     * @author Rivis
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    boolean updateCurriculumByCurriculumAny(Curriculum curriculum);

    /**
     * 查询课程
     *
     * @author Rivis
     * @param curriculumId {Long} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    Curriculum selectCurriculumById(Long curriculumId);

    /**
     * 查询课程
     *
     * @author Rivis
     * @param param {Object} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    Curriculum selectCurriculumByObject(Object param);

    /**
     * 查询课程
     *
     * @author Rivis
     * @param curriculum {Curriculum} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @date 2018/5/30 20:30
     */
    Curriculum selectCurriculumByCurriculumAny(Curriculum curriculum);
}
