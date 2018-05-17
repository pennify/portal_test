package com.portal.base;


/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public class BaseException extends RuntimeException {

    private Integer error_code = Integer.valueOf(500);

    public Integer getError_code() {
        return this.error_code;
    }

    public void setError_code(Integer error_code) {
        this.error_code = error_code;
    }

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(Integer error_code, String msg) {
        super(msg);
        this.error_code = error_code;
    }
}
