package com.karana.etu2060.framework.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Cors {
    String allowedOrigin() default "*";
}
