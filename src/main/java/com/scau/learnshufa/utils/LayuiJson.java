package com.scau.learnshufa.utils;

/**
 * @author li chang wei
 * 用于构造返回给前端Layui框架所需的字符串
 */
public class LayuiJson {
    private String msg = ",\"msg\":\"Gettags\"";
    private String code = "{\"code\":0";
    private String count = "0";
    private String data = ""; //保存json字符串

    public LayuiJson(String count, String json_data) {
        this.count = ",\"count\":" + count;
        this.data = ",\"data\":" + json_data + "}";
    }

    public LayuiJson(String msg, String count, String data) {
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return code + msg + count + data;
    }
}
