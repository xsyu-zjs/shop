package com.imooc.mall.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.imooc.anti.Constant;
import org.apache.commons.codec.binary.Base64;

public class MD5Utils {
    public MD5Utils() {
    }

    public static String getMD5Str(String strValue, String icode) throws NoSuchAlgorithmException {
        //Boolean refresh = Constant.refresh(icode);
        //if (refresh) {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return Base64.encodeBase64String(md5.digest((strValue + "8svbsvjkweDF,.03[").getBytes()));
        //} else {
        //    throw new RuntimeException("请从PC课程详情页右侧获取正确的ICODE，并在application.properties中配置");
        //}
    }

    public static void main(String[] args) {
        String md5 = null;

        try {
            md5 = getMD5Str("1234", "83");
        } catch (NoSuchAlgorithmException var3) {
            var3.printStackTrace();
        }

        System.out.println(md5);
    }
}
