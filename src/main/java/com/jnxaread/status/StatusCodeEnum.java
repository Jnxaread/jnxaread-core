package com.jnxaread.status;

/**
 * @Author 未央
 * @Create 2021-01-30 11:11
 */
public enum StatusCodeEnum {
    OK("0000", "执行成功"),
    PASS_CHECK_FORBIDDEN("010001", "禁止通行"),
    PASS_CHECK_LIMITED("010002", "禁止通行");


    private final String code;
    private final String describe;

    StatusCodeEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    public String getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }
}
