package com.atguigu.java;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author shen_wzhong
 * @create 2022-03-28 16:21
 */
public class StringTest1 {
    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);
    }


    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        s2 += "def";

        System.out.println(s2);
        System.out.println(s1);
    }

    @Test
    public void test3() {
        String s1 = new String("abc");
        String s2 = s1.replace('a','m');

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test4() {
        //方式一、预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化： 日期--->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);

        //解析： 字符串 --->日期
        TemporalAccessor parse = formatter.parse("2021-05-20T10:18:19.554");
        System.out.println(parse);

        //方式二
        //本地化相关的格式。如ofLocalizedDateTime()
        //FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于localDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//SHORT: 21-5-20 下午6:42 / MEDIUM: 2021-5-20 18:43:08 / LONG: 2021年5月20日 下午06时43分47秒
        //本地化相关的格式。如ofLocalizedDate()
        //FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于localDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//FULL: 2021年5月20日 星期四

        //方式三、自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2021-05-20 06:51:15

        //解析
        TemporalAccessor accessor = formatter3.parse("2021-05-20 06:51:15");
        System.out.println(accessor);
    }
}
