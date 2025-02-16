package top.leafii.testonline.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author  叶蕴森
 * @Date 2020.3.21
 * 此工具类用于密码的MD5加密
 */
public class MD5 {
    public static String md5(String s){
        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(s.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }
            // 标准的md5加密后的结果
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

//    public static void main(String[] args) {
//        String pwd = "adminadmin";
//        String s = md5(pwd);
//        System.out.println(s);
////运行结果:e10adc3949ba59abbe56e057f20f883e
//    }
}
