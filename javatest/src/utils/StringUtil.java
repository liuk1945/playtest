package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: michael
 * Date: 12-12-12
 * Time: 上午10:35
 * Useage:
 */
public class StringUtil {
    public static void strsplit(){
        List<String>  allow_request_server_ips = new ArrayList<String>();
        String str = "127.0.0.1,";
        for(String ip :str.split(",")){
            System.out.println(ip);
            allow_request_server_ips.add(ip);
        }
        System.out.println(allow_request_server_ips);
        System.out.println(allow_request_server_ips.size());
        System.out.println(allow_request_server_ips.contains("127.0.0.1"));


    }

    public static SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
    public static String getPartitionByDate(Date date){
        StringBuilder partstr = new StringBuilder();
        partstr.append("PARTITION( P")
                .append(format.format(date))
                .append(" ) ");

        return partstr.toString();
    }

    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

        String ip = "[128.0.0.1]";
        ip =  ip.replaceAll("\\[","").replaceAll("\\]","");
        //String ip2 =  ip.replaceAll("(\\])","");
        System.out.println(ip);


    }
}
