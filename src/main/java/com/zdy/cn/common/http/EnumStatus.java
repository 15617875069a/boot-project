package com.zdy.cn.common.http;

public enum  EnumStatus {

    OK(20000,"操作成功"),
    ERROR(40000,"操作失败"),
    NO_LOGIN(33333,"未登录"),
    ACCOUNT_ERROR(22222,"用户名不正确");
    private int status;
    private String message;

   EnumStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
