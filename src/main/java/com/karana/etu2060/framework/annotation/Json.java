package com.karana.etu2060.framework.annotation;

import java.lang.annotation.*;

import com.karana.etu2060.framework.annotation.property.JsonMethods;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Json {
    JsonMethods method() default JsonMethods.GET;
}