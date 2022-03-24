package com.leetcode.easy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 0, 6, 7, 0, 8 };
        int k=0;
        int [] newArray = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            newArray[k++] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(arr));

    }
}