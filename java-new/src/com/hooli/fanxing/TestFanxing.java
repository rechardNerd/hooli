package com.hooli.fanxing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月25日 22:45
 */
@Slf4j
public class TestFanxing {

    /**
     * 类型通配符一般使用?代替具体的类型实参，通配符表示未知类型
     * @param obj
     */
    public void showKeyValue(Generic<?> obj){
        log.info("key value is " + obj.getKey());
    }


    @Test
    public void testfx(){
        Generic generic = new Generic("123132");
        Generic generic1 = new Generic(2324);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);
        log.info("key is {}",generic.getKey());
        log.info("key is {}",generic1.getKey());
        log.info("key is {}",generic2.getKey());
        log.info("key is {}",generic3.getKey());
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);
        showKeyValue(gNumber);
    }
}
