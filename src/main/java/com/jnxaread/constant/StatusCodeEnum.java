package com.jnxaread.constant;

/**
 * 状态码枚举类
 * 所有涉及到响应的状态码都保存在该类中
 * 规定：
 * 状态码为6为数字字符串
 * 前2位表示执行系统，后4位表示执行状态
 * 系统标识：
 * 00：所有系统
 * 01：客户端系统
 * 02：服务端系统
 * 03：第三方系统
 *
 * @Author 未央
 * @Create 2021-01-30 11:11
 */
public enum StatusCodeEnum {
    OK("000000", "执行成功"),
    PASS_CHECK_FORBIDDEN("010001", "禁止通行"),
    PASS_CHECK_LIMITED("010002", "禁止通行"),
    PARAMETER_INVALID("010003", "参数错误"),
    ACCOUNT_OR_PASSWORD_INVALID("010004", "账号或密码错误"),
    NOT_LOGGED_IN("010010", "用户未登录"),
    ALREADY_LOGGED_IN("010011", "用户已登录"),
    EMAIL_SENT_FAILED("020010", "发送邮件失败"),


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
