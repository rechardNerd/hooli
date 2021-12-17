package com.product;

import com.alibaba.fastjson.JSONObject;
import com.product.service.AnnotationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;


import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月27日 15:00
 */
@Slf4j
public abstract class BaseAnnotationService<T extends Annotation> implements AnnotationService {

    private final String ruleField = "(\\$\\{[^>]*?\\})";
    private final Pattern pattern = Pattern.compile(ruleField);

    private Class<T> annotationClass;

    public Class<T> getAnnotationClass(){
        return annotationClass;
    }

    public void setAnnotationClass(Class<T> annotationClass) {
        this.annotationClass = annotationClass;
    }

    public BaseAnnotationService(Class<T> annotationClass) {
        this.annotationClass = annotationClass;
    }

    @Override
    public void onValueSet(Object targetObject, String filedname, Object fieldValue){
        String name = getClass().getSimpleName();
        log.debug(name + ".onValueSet--->" + targetObject.getClass().getSimpleName() + " fieldname:" + filedname + " fieldvalue:" + fieldValue );
        if (targetObject instanceof JSONObject){
            JSONObject source = (JSONObject) targetObject;
            source.put(filedname, fieldValue);
        }else if (targetObject instanceof Map){
            @SuppressWarnings("unchecked")
            Map<String,Object> source = (Map<String, Object>) targetObject;
            source.put(filedname,fieldValue);
        }else{
            try{
                BeanWrapper rowBean = new BeanWrapperImpl(targetObject);
                rowBean.setPropertyValue(filedname,fieldValue);
            }catch (Exception e){
                log.error("write {} to {} failure:{}",filedname,fieldValue,e.getMessage());
            }
        }
    }

    @Override
    public Object onValueGet(Object targetObject, String fieldName){
        String name = getClass().getSimpleName();
        log.debug(name + ".onValueGet--->" + targetObject.getClass().getSimpleName());
        if (targetObject instanceof JSONObject){
            JSONObject source = (JSONObject) targetObject;
            if(source.containsKey(fieldName)){
                return source.get(fieldName);
            }
        }else if (targetObject instanceof Map){
            @SuppressWarnings("unchecked")
            Map<String,Object> source = (Map<String, Object>) targetObject;
            if(source.containsKey(fieldName)){
                return source.get(fieldName);
            }
        }else{
            // 对Bean模式的支持 钱海斌 2021-08-16
            JSONObject source = (JSONObject) T
        }

        return null;
    }
}
