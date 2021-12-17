package com.hooli.zhichuandi;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年12月15日 15:55
 */
public class zhichuandi2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第一个元素变为0
        array[0] = 0;
    }
}
