package utils;

import java.util.Date;

/**
 * User: michael
 * Date: 13-3-15
 * Time: 下午2:33
 * Useage:
 */
public class DateUtil {
    public static Date getYesterday(){
        Date today = new Date();
        long time = today.getTime()-1*60*60*24*1000;
        today.setTime(time);
        return today;
    }



    public static void  main(String[] args){
        System.out.println(getYesterday());


    }
}
