package com.product.util;

/**
 * 分布式唯一ID 雪花算法实现
 */
public class SnowFlakeID {
    /**
     * 起始的时间戳 2020-06-30 00：00：00
     */
    private final static long START_TIMESTAMP = 1593446400L;

    /**
     * 每一部分占用的位数
     */
    private final static long SEQUENCE_BIT = 12;    // 序列号占用的位数
    private final static long MACHINE_BIT = 5;      // 机器标识占用的位数
    private final static long DATA_CENTER_BIT = 5;  //数据中心占用的位数

    /**
     * 每一部分的最大值
     */
    private final static long MAX_DATA_CENTER_NUM = -1L ^ (-1L << DATA_CENTER_BIT);
    private final static long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private final static long MAX_SEQUENCE = -1L ^ (-1L << SEQUENCE_BIT);
}
