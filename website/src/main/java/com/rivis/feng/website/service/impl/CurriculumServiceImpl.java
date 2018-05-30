package com.rivis.feng.website.service.impl;

import com.rivis.feng.website.pojo.po.Curriculum;
import com.rivis.feng.website.service.CurriculumService;

import java.util.List;

/**
 * 课程业务逻辑实现
 *
 * @author Rivis
 * @date 2018/5/30 20:05
 */
public class CurriculumServiceImpl implements CurriculumService {
    /**
     * 添加课程
     *
     * @param param {Object} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean addCurriculumByObject(Object param) {
        return false;
    }

    /**
     * 添加课程
     *
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean addCurriculumByCurriculumAny(Curriculum curriculum) {
        return false;
    }

    /**
     * 查询课程列表
     *
     * @param param {Object} 查询课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public List<Curriculum> listCurriculumByObject(Object param) {
        return null;
    }

    /**
     * 查询课程列表
     *
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public List<Curriculum> listCurriculumByCurriculumAny(Curriculum curriculum) {
        return null;
    }

    /**
     * 删除课程
     *
     * @param param {Object} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean deleteCurriculumByObject(Object param) {
        return false;
    }

    /**
     * 根据ID删除课程
     *
     * @param curriculumId {Long} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean deleteCurriculumById(Long curriculumId) {
        return false;
    }

    /**
     * 根据课程条件删除相应课程
     *
     * @param curriculum {Curriculum} 需要删除的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean deleteCurriculumByCurriculumAny(Curriculum curriculum) {
        return false;
    }

    /**
     * 更新课程
     *
     * @param param {Object} 需要更新的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean updateCurriculumByObject(Object param) {
        return false;
    }

    /**
     * 更新课程
     *
     * @param curriculum {Curriculum} 需要添加的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public boolean updateCurriculumByCurriculumAny(Curriculum curriculum) {
        return false;
    }

    /**
     * 查询课程
     *
     * @param curriculumId {Long} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public Curriculum selectCurriculumById(Long curriculumId) {
        return null;
    }

    /**
     * 查询课程
     *
     * @param param {Object} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public Curriculum selectCurriculumByObject(Object param) {
        return null;
    }

    /**
     * 查询课程
     *
     * @param curriculum {Curriculum} 需要查询的课程的参数
     * @return {boolean} 返回的结果
     * @author Rivis
     * @date 2018/5/30 20:30
     */
    @Override
    public Curriculum selectCurriculumByCurriculumAny(Curriculum curriculum) {
        return null;
    }
}
