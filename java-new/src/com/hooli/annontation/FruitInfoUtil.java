package com.hooli.annontation;

import java.lang.reflect.Field;

/**
 * @Description: 注解处理器
 * @author: wude
 * @date: 2021年11月26日 17:09
 */
public class FruitInfoUtil {
    public static void gerFruitInfo(Class<?> clazz){
        String strFruitName = "水果名称: ";
        String strFruitColor = "水果颜色: ";
        StringBuffer strFruitProvider = new StringBuffer("供应商信息: ");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvider.append(" 供应商编号： ").append(fruitProvider.id());
                strFruitProvider.append(" 供应商名称: ").append(fruitProvider.name());
                strFruitProvider.append(" 供应商地址: ").append(fruitProvider.address());
                System.out.println(strFruitProvider.toString());
            }
        }
    }
}
