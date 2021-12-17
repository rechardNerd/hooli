package com.shiji.core.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE,ElementType.FIELD})
public @interface ReferQueryRepeatedValues {
    ReferQuery[] value();
}
