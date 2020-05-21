package com.jnxaread.util;

/**
 * 内容校验工具类
 *
 * @author 未央
 * @create 2020-05-06 8:47
 */
public class ContentUtil {

    /**
     * 内容非空校验
     *
     * @param validate
     * @return
     */
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

    /**
     * 汉字字数统计
     *
     * @param content
     * @return
     */
    public static int getWordCount(String content) {
        String regWord = "^[\u4e00-\u9fa5]{1}$";
        int wordCount = 0;
        for (int i = 0; i < content.length(); i++) {
            String word = Character.toString(content.charAt(i));
            if (word.matches(regWord)) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
