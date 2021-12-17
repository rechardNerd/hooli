package com.hooli.basictype;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月25日 20:59
 */
public class BasicType2 {
    private String a;
    // 在 java8 中，Integer缓存池的大小默认为 -128～127
   /** static final int low = -128;
    static final int high;
    static final Integer cache[];

    static {
        // high value may be configured by property
        int h = 127;
        String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        if (integerCacheHighPropValue != null){
            int i = parseInt(integerCacheHighPropValue);
            i = Math.max(i, 127);
            // Maximum array size is Integer.MAX_VALUE
            h = Math.min(i,Integer.MAX_VALUE - (-low) -1);
        }
    }**/


    /**
     * 基本类型对应的缓冲池
     * boolean values true and false
     * all byte values
     * short values between -128 and 127
     * int values between -128 and 127
     * char in the range \u0000 to \u007F
     * 在使用这些基本数据类型对应的包装类型时，如果该数值范围在缓冲池范围内，就可以直接使用缓冲
     * 池中的对象
     */


    /**
     * 在JDK1.8所有的数据类缓冲池中，Integer的缓冲池IntegerCache很特殊，
     * 这个缓冲池的下界是 -128，上界默认是127，但是这个上界是可调的，在启动JVM
     * 的时候，通过-XX:AutoBoxCacheMax=<size>来指定这个缓冲池的大小，该选项在JVM
     * 初始化的时候会设定一个名为java.lang.IntegerCache.high系统属性
     */
}
