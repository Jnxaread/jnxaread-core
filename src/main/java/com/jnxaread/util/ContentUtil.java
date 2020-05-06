package com.jnxaread.util;

/**
 * 内容校验工具类
 *
 * @author 未央
 * @create 2020-05-06 8:47
 */
public class ContentUtil {

    public static boolean inspection(String validate) {
        String validateA = validate.replaceAll(" ", "");
        String validateB = validateA.replaceAll("<p>", "");
        String validateC = validateB.replaceAll("</p>", "");
        String validateD = validateC.replaceAll("&nbsp;", "");
        String validateE = validateD.replaceAll("<br>", "");
        if (validateE.length() != 0) {
            return true;
        } else {
            return false;
        }
    }

}
