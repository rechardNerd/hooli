package com.hooli.annontation;

import lombok.Data;

/**
 * @Description: 注解使用
 * @author: wude
 * @date: 2021年11月26日 17:27
 */
@Data
public class Apple {
    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1,name = "陕西红富士集团",address = "陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    public void displayName(){
        System.out.println("水果的名称是：苹果");
    }
}
