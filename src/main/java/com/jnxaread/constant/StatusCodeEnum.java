package com.jnxaread.constant;

/**
 * @Author 未央
 * @Create 2021-01-30 11:11
 */
public enum StatusCodeEnum {
    OK("000000", "执行成功"),
    PASS_CHECK_FORBIDDEN("010001", "禁止通行"),
    PASS_CHECK_LIMITED("010002", "禁止通行"),
    PARAMETER_INVALIDATE("010003", "参数错误"),
    ACCOUNT_OR_PASSWORD_INVALIDATE("010004", "账号或密码错误"),
    NOT_LOGGED_IN("010010", "用户未登录"),


    EXECUTION_TIMEOUT("020100", "系统执行超时");


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
