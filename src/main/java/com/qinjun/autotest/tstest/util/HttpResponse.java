package com.qinjun.autotest.tstest.util;


import org.apache.http.Header;

public class HttpResponse {
    Integer status;
    String body;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
