package com.shiji.core.component;

import org.springframework.core.GenericTypeResolver;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月27日 12:27
 */
public class BaseComponent<T> {
    // private 当前类访问
    private String lastErrMessage = "";
    private String lastWarMessage = "";
    private int lastErrCode = 0;

    // GenericTypeResolver spring范型辅助类
    // protected当前类、同包、子类可以访问，不同类不允许访问
    @SuppressWarnings("unchecked")
    protected final Class<T> beanClass = (Class<T>) GenericTypeResolver.resolveTypeArgument(this.getClass(),BaseComponent.class);

    protected Class<T> getBeanClass(){
        return beanClass;
    }

    public String getLastErrMessage() {
        return lastErrMessage;
    }

    public void setLastErrMessage(String lastErrMessage) {
        this.lastErrMessage = lastErrMessage;
    }

    public void setLastErrMessage(String returncode, String formatmsg, Object... args){
        this.setLastErrCode(-1);
        // this.setLastErrMessage(MessageSourceHelper.getDefault().getMessage(returncode, formatmsg, null, args));
    }

    public String getLastWarMessage() {
        return lastWarMessage;
    }

    public void setLastWarMessage(String lastWarMessage) {
        this.lastWarMessage = lastWarMessage;
    }

    public int getLastErrCode() {
        return lastErrCode;
    }

    public void setLastErrCode(int lastErrCode) {
        this.lastErrCode = lastErrCode;
    }

    protected String[] checkFields(String[] paramFields, Set<String> returnSet){
        // getFields() 获得某个类的所有的公共(public)的字段，包括父类中的字段
        // getDeclaredFields() 获得某个类的所有声明的字段，即包括public、private和protected,但不包括父类声明字段
        java.lang.reflect.Field[] modelFields = this.beanClass.getDeclaredFields();
        return checkFields(paramFields,returnSet,modelFields);
    }

    public static String[] checkFields(String[] paramFields, Set<String> returnSet, Field[] modelFields){
        String[] modelFieldNames = new String[modelFields.length];
        Field.setAccessible(modelFields,true);  // 有些成员是private，设置后可以访问
        boolean entIdflag = true;
        for (int i = 0; i < modelFieldNames.length; i++){
            modelFieldNames[i] = modelFields[i].getName();
        }
        Set<String> set = new HashSet<String>();
        for (String paramfield : paramFields){
            if("endId".equals(paramfield)){
                entIdflag = false;
            }
            set.add(paramfield);
        }
        for (String modelField : modelFieldNames){
            set.remove(modelField);
        }
        // 返回校验的set
        returnSet.addAll(set);
        // 去除注解查询字段
        List<String> list = new ArrayList<>(Arrays.asList(paramFields));
        for (Field field : modelFields){
            if (field.isAnnotationPresent())
        }
        return null;
    }
}
