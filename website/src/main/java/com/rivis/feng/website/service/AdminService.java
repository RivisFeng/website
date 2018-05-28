package com.rivis.feng.website.service;

import com.rivis.feng.website.pojo.dto.AdminInDto;
import com.rivis.feng.website.pojo.po.AdminUser;
import com.rivis.feng.website.pojo.query.AdminQuery;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface AdminService {

    /**
     * 添加管理员
     *
     * @author Rivis
     * @param adminInDto {AdminInDto}
     * @return {boolean}
     * @date 2018/05/28
     */
    boolean addAdmin(AdminInDto adminInDto);

    /**
     * 删除管理员
     *
     * @author Rivis
     * @param param {Long}
     * @return {boolean}
     * @date 2018/05/28
     */
    boolean deleteAdmin(Long param);

    /**
     * 更新管理员
     *
     * @author Rivis
     * @param adminInDto {AdminInDto}
     * @return {boolean}
     * @date 2018/05/28
     */
    boolean updateAdmin(AdminInDto adminInDto);

    /**
     * 查询管理员
     *
     * @author Rivis
     * @param param {Long}
     * @return {boolean}
     * @date 2018/05/28
     */
    AdminUser selectAdmin(Long param);

    /**
     * 查询所有管理员
     *
     * @author Rivis
     * @param adminQuery {AdminQuery}
     * @return {boolean}
     * @date 2018/05/28
     */
    List<AdminUser> listAdmin(AdminQuery adminQuery);
}
