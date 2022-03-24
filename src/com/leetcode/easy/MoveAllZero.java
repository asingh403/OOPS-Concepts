//leetcode: 283
//https://leetcode.com/problems/move-zeroes/
package com.leetcode.easy;

import java.util.Arrays;

public class MoveAllZero {

    public static void main(String[] args) {
        //int[] arr = { 1, 2, 6, 0, 6, 7, 0, 8 };
        int[] arr = {1, 0, 6, 0, 4};
        //System.out.println();
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] arr) {
       int count = 0;
       int [] newArray = new int[arr.length];

       for(int num:arr){
           if(num !=0){
               newArray[count] = num;
               count++;
           }
       }
        System.out.println(Arrays.toString(newArray));
    }
}
