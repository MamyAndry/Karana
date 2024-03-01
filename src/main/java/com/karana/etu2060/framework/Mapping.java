package com.karana.etu2060.framework;

import com.karana.etu2060.framework.annotation.Url;
import java.lang.reflect.Method;


public class Mapping {
    String className;
    String methods;
    String httpMethods;


    //GETTERS
    public String getHttpMethods() {
        return httpMethods;
    }

    public String getClassName() {
        return className;
    }

    public String getMethods() {
        return methods;
    }

//SETTERS
    public void setClassName(String className) {
        this.className = className;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }
    public void setHttpMethods(String httpMethods) {
        this.httpMethods = httpMethods;
    }

//CONSTRUCTOR
    public Mapping(String className, String methods) {
        this.setClassName(className);
        this.setMethods(methods);
    }

    public Mapping(String className, String methods, String HttpMethod) {
        this.setClassName(className);
        this.setMethods(methods);
        this.setHttpMethods(HttpMethod);
    }
    
    public Method getMethod(Method[] methods, String name){
        int i = 0;
        while( !methods[i].getName().equals(name)) i++;
        return methods[i];
    }
    public String getErrorUrl() throws Exception{
        Object obj = Class.forName(this.getClassName()).getConstructor().newInstance();
        Method[] listMethod = obj.getClass().getDeclaredMethods();
        Method method = this.getMethod(listMethod, this.getMethods());
        return method.getAnnotation(Url.class).errorPage();
    }
    
}
