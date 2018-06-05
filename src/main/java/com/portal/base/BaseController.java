package com.portal.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by peng
 * on 2018/5/17 0017.
 */
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;
    @Autowired
    protected ServletContext application;
    private static ValueFilter filter = new ValueFilter() {
        public Object process(Object obj, String s, Object v) {
            return v == null?"":v;
        }
    };

    public BaseController() {
    }

    protected void log(String msg) {
        this.logger.info(msg);
    }

    @ExceptionHandler
    @ResponseBody
    public String ExceptionHandler(HttpServletRequest request, Exception ex) {
        Result result = new Result();
        if(ex instanceof BaseException) {
            result.setCode(1);
            result.setMsg(ex.getMessage());
        }

        this.logger.error("ExceptionHandler", ex);
        return this.resultToJson(result);
    }
    public String resultToJson(Result result) {
        return JSON.toJSONString(result, filter, new SerializerFeature[0]);
    }

}
