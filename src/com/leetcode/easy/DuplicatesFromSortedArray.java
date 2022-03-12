package com.leetcode.easy;

public class DuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int intIndex = 1;

        for(int i=1; i<len; i++){
            if(nums[i] != nums[i-1]){
                nums[intIndex] = nums[i];
                intIndex++;
            }
        }
        return intIndex;
    }


    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};

        int uniqueElements = removeDuplicates(arr);

        System.out.println("Nums of Unique element "+ uniqueElements);

    }
}
