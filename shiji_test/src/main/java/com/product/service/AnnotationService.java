package com.product.service;

import com.product.model.ServiceSession;

public interface AnnotationService {
    void onAction(ServiceSession session, Object targetObject,Class<?> beanClass) throws Exception;
    void onValueSet(Object targetObject, String filedname, Object fieldValue);
    Object onValueGet(Object targetObject, String fieldName);
}
