package com.rivis.feng.website.controller.web;

import com.rivis.feng.website.pojo.dto.ResultDataDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统配置API
 * @author Rivis
 * @date 2018/5/21 22:11
 * @description
 */
@RequestMapping(value = "/website/system")
@RestController
public class SystemController {

    /**
     * 添加系统配置接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/addSystemSetting")
    public ResultDataDto addSystemSetting(){
        return null;
    }

    /**
     * 获取前端界面显示内容配置接口
     *
     * @author Rivis
     * @return {ResultDataDto}
     * @date 2018/05/27
     */
    @RequestMapping(value = "/selectSystemWebsiteViewSetting")
    public ResultDataDto selectSystemWebsiteViewSetting(){
        return null;
    }
}
