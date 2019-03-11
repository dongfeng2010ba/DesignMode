package com.dong.composite;

public class StringUtils {
    public static String repeatableString(String str, int depth) {
        String result = "";
        for (int i = 0; i < depth; i++) {
            result += str;
        }
        return result;
    }
}
