package com.example.xiaoshuo.utils;

import org.apache.log4j.Logger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * MD5工具类
 */
public class MD5Util {
    public static Logger LOGGER = Logger.getLogger(MD5Util.class);
    public static String getMD5(String str){
        String result = "";
        if(str != null && str.length() > 0){
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(str.getBytes());
                byte[] digest = md5.digest();
                if(digest != null && digest.length > 0){
                    for (byte d: digest) {
                        result = result + d;
                    }
                }else{
                    LOGGER.info("MD5 digest is null");
                }
            } catch (NoSuchAlgorithmException e) {
                LOGGER.error("MD5Utils error");
            }
            return result;
        }else {
                LOGGER.info("MD5Utils Str is null");
                return result;
        }

    }
}
