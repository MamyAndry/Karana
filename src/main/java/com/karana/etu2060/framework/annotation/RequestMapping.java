package com.karana.etu2060.framework.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface RequestMapping {
    String path() default "";
}