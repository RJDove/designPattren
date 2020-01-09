package com.rj.design.study.algorithm.selection;

import java.util.Arrays;

/**
 * 选择排序算法
 */
public class SortArray {

    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static <T extends Comparable<? super T>> int getIndexOfSmallest(T[] a, int first, int last) {
        T min = a[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (a[index].compareTo(min) < 0) {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    private static <T extends Comparable<? super T>> void selectionSort(T[] a, int n) {
        for (int index =0; index < n -1; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(a, index, n - 1);
            swap(a, index, indexOfNextSmallest);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {3,2,1,5,9,6,8,7};
        selectionSort(a, 4);
        System.out.println(Arrays.toString(a));
    }
}
