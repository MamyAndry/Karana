package com.karana.etu2060.framework.annotation;
import java.lang.annotation.*;


/**
 *
 * @author Mamisoa
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {
    String parameterName() default "arg";
}
