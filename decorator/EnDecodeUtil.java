package com.dong.decorator;
/*
* 加密算法的工具类
* */
public class EnDecodeUtil {
    //加密算法用到的元素
    private static final char password='a';

    //加密和解密过程是相互的，运行一次是加密，再运行一次就是解密

    //加密
        public static String encode(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ password);
        }
        return new String(chars);
    }


    //解密
    public static String decode(String str){
         return encode(str);
    }
}
