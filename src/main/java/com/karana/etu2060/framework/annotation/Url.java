package com.karana.etu2060.framework.annotation;

import java.lang.annotation.*;

import com.karana.etu2060.framework.annotation.property.HttpMethod;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Url{
    String url() default "";   
    String errorPage() default "";
    HttpMethod method() default HttpMethod.GET;
}