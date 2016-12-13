package com.baurine.databindingdemo.util;

/**
 * Created by baurine on 12/13/16.
 */

public class MyStringUtil {
    public static String capitalize(final String src) {
        if (src != null && src.length() > 1) {
            return String.valueOf(src.charAt(0)).toUpperCase() + src.substring(1);
        }
        return src;
    }
}
