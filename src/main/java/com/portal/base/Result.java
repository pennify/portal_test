package com.portal.base;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public class Result {

    public Integer code;
    public String msg;
    public Object data;
    private String redirect;

    public Result(){

    }

    public Result(Integer code, String msg) {
        this(code,msg,null);
    }

    public Result(Integer code, String msg, Object data) {
        this(code,msg,data,null);
    }

    public Result(Integer code, String msg,String redirect){
        this(code,msg,null,redirect);
    }
    public Result(Integer code, String msg, Object data, String redirect) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.redirect = redirect;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    @Override
    public String toString() {
        return "code : " + this.code + "; msg : " + this.msg + "; data : " + this.data + "; redirect : " + this.redirect;
    }
}
