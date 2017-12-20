package com.jmu.bibasedmanage.vo;

/**
 * 通用的返回类
 * Created by ljc on 2017/12/18.
 */
public class JsonResponse {
    private String status;
    private Object result;

    public JsonResponse() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
