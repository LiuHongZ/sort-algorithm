package com.wilson.sort;

import java.util.Arrays;

/**
 * @author wilson
 * 日期 2019/10/22 16:15
 * 描述 冒泡排序
 * @version 1.0
 * @since 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int small = array[j + 1];
                if (array[j] > small) {
                    array[j + 1] = array[j];
                    array[j] = small;
                }
            }
        }
        return array;
    }
}
