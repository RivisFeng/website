package com.rivis.feng.website.pojo.query;

import com.rivis.feng.website.pojo.dto.AdminInDto;

import java.util.Date;

/**
 * @author Rivis
 * @date 2018/05/28
 */
public class AdminQuery extends AdminInDto {

    private Date adminCreateTime;

    public Date getAdminCreateTime() {
        return adminCreateTime;
    }

    public void setAdminCreateTime(Date adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

}
