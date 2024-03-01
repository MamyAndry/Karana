package com.karana.etu2060.framework.annotation.property;

/**
 *
 * @author Mamisoa
 */
public enum HttpMethod {
    GET("GET"),
    PUT("PUT"),
    POST("POST"),
    DELETE("DELETE");

    private String method;
    
    public void setMethod(String method){
        this.method = method;
    }
    public String getMethod(){
        return  this.method;
    }

    private HttpMethod(String method){
        this.setMethod(method);
    }
}
