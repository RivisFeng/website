package com.rivis.feng.website.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Auther: Rivis
 * @Date: 2018/5/9 22:09
 * @Description:
 */
public class DateUtil {

    /**
     * 获取指定日期的以后的N天的日期
     *
     * @author Rivis
     * @param date {Date} 指定日期
     * @param day {int} 要获得以后日期和指定日期的天数
     * @return {Date} 指定日期的以后的N天的日期
     */
    public static Date addDay(Date date, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }
}
