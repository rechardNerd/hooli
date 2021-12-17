package com.shiji.core.annotation;

import com.product.service.OperationFlag;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE,ElementType.FIELD})
@Documented
@Repeatable(ReferQueryRepeatedValues.class)
public @interface ReferQuery {
    String table();
    String query();
    String set();
    OperationFlag[] operationFlags() default {};
}
