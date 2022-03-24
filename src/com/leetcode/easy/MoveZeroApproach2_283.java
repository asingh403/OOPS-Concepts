package com.leetcode.easy;

import java.util.Arrays;

public class MoveZeroApproach2_283 {
    public static void moverZeros(int [] arr){
        int count = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];

            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 0, 6, 7, 0, 8 };
        moverZeros(arr);

    }
}
