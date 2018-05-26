package com.rivis.feng.website.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 *
 * @Auther: Rivis
 * @Date: 2018/5/9 22:09
 */
public class DateUtil {

    /**
     * 获取指定日期的以后的N天的日期
     *
     * @author Rivis
     * @param date {Date} 指定日期
     * @param day {int} 要获得以后日期和指定日期的天数
     * @return {Date} 指定日期的以后的N天的日期
     * @date 2018/05/27
     */
    public static Date addDay(Date date, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    /**
     * 判断Date是否为空 为空返回 true 不为空返回 false
     *
     * @author Rivis
     * @param param {Date} 要判断是否为空的对象
     * @return {boolean} 返回的结果
     * @date 2018/05/27
     */
    public static boolean dateIsNull(Date param){
        boolean flag = false;
        if (param != null) {
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }
}
