package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rivis
 * @date 2018/5/21 22:09
 * @description
 */
@RestController
@RequestMapping(value = "/website/curriculum")
public class CurriculumController {

    /**
     * 课程大概信息列表接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/curriculumProbablyList")
    public ResultDataDto curriculumProbablyList(){
        return null;
    }

    /**
     * 课程详细信息接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/curriculumDetail")
    public ResultDataDto curriculumDetail(){
        return null;
    }

    /**
     * 添加课程接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/addCurriculum")
    public ResultDataDto addCurriculum(){
        return null;
    }

    /**
     * 更改课程信息接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/updateCurriculum")
    public ResultDataDto updateCurriculum(){
        return null;
    }

    /**
     * 删除课程接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/deleteCurriculum")
    public ResultDataDto deleteCurriculum(){
        return null;
    }

    /**
     * 购买课程接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/buyCurriculum")
    public ResultDataDto buyCurriculum(){
        return null;
    }

}
