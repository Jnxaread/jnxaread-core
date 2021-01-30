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
     * @param validate 需要校验的内容
     * @return 校验结果
     */
    public static boolean inspection(String validate) {
        String validateA = validate.replaceAll(" ", "");
        String validateB = validateA.replaceAll("<p>", "");
        String validateC = validateB.replaceAll("</p>", "");
        String validateD = validateC.replaceAll("&nbsp;", "");
        String validateE = validateD.replaceAll("<br>", "");
        return validateE.length() != 0;
    }

    /**
     * 汉字字数统计
     *
     * @param content 需要统计的内容
     * @return 字数
     */
    public static int getWordCount(String content) {
        String regWord = "^[一-龥]$";
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
