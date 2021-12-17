package com.product.model;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月27日 18:09
 */
public class RowMap extends HashMap<String,Object> {

    // 获取排序后的序列化
    protected String getString(Map<String,Object> dataMap){
        // 获取关键字列表
        Set<String> keySet = dataMap.keySet();
        // 进行关键字排序
        SortedSet<String> sortedSet = new TreeSet<String>();
        for(String keyName:keySet){
            sortedSet.add(keyName);
        }
        // 转换至排序对象
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        for (String keyName : sortedSet){
            resultMap.put(keyName,dataMap.get(keyName));
        }
        // 返回序列化结果
        return JSON.toJSONString(resultMap);
    }
}
