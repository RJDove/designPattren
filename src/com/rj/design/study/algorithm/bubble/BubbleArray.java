package com.rj.design.study.algorithm.bubble;

import java.util.Arrays;


public class BubbleArray {

    public static void main(String[] args) {
        Integer[] a = {12, 3, 4, 44, 566};
        bubbleSort(a);
        System.out.println("bubbleSort: " + Arrays.toString(a));

        Integer[] b = {12, 3, 4, 44, 566};
        selectionSort(b);
        System.out.println("selectionSort: " + Arrays.toString(b));

        Integer[] c = {12, 3, 4, 44, 566};
        insertionSort(c);
        System.out.println("insertionSort: " + Arrays.toString(c));
    }

    /**
     * 冒泡排序
     * <p>时间复杂度 O(n^2)</p>
     *
     * @param a
     * @param <T>
     */
    private static <T extends Comparable<? super T>> void bubbleSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    T temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * <p>时间复杂度O(n^2)</p>
     *
     * @param a
     * @param <T>
     */
    private static <T extends Comparable<? super T>> void selectionSort(T[] a) {
        int minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    /**
     * 插入排序
     * <p>时间复杂度O(n^2)</p>
     *
     * @param a
     * @param <T>
     */
    private static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            T temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                //将大于temp的数向后移动一步
                if (a[j].compareTo(temp) > 0) {
                    //记录j的值也就是temp要插入的位置
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }

    }

    public static Comparable[] shellSort(Comparable[] array) {
        // 从小到大排列
        int h = 1;
        while (h < array.length / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j].compareTo(array[j - h]) < 0; j -= h) {
                    Comparable temp = array[j - h];
                    array[j - h] = array[j];
                    array[j] = temp;
                }
            }
            h = h / 3;
        }
        return array;
    }

}
