package com.jnxaread.entity;

/**
 * 蜂巢社区自定义响应结构
 *
 * @author 未央
 * @create 2019-10-30 19:25
 */
public class UnifiedResult {
    public static void main(String[] args) {
        UnifiedResult build = UnifiedResult.build("0001");
        System.out.println(build.getStatus());
        System.out.println(build.getMsg());
        System.out.println(build.getData());
    }

    // 响应业务状态
    private String status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    // 构造函数
    public UnifiedResult() {
    }

    public UnifiedResult(Object data) {
        this.status = "000000";
        this.msg = "OK";
        this.data = data;
    }

    public UnifiedResult(String status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static UnifiedResult ok() {
        return new UnifiedResult(null);
    }

    public static UnifiedResult ok(Object data) {
        return new UnifiedResult(data);
    }

    public static UnifiedResult build(String status) {
        return new UnifiedResult(status, null, null);
    }

    public static UnifiedResult build(String status, String msg, Object data) {
        return new UnifiedResult(status, msg, data);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
