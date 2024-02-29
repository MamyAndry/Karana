package com.karana.etu2060.framework.annotation.property;

/**
 *
 * @author Mamisoa
 */
public enum JsonMethods {
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

    private JsonMethods(String method){
        this.setMethod(method);
    }
}
