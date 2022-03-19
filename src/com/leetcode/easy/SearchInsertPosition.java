package com.leetcode.easy;

public class SearchInsertPosition {
    public static int searchInsertPosition(int [] nums, int target){

        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <=high){
            int mid = (low+high)/2;

        if(nums[mid] ==target) return mid;

        else if(nums[mid] >target)
            high = mid-1;

        else
            low = mid+1;
        }
        return  (low+high+1)/2;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6};
        int k = 7;
        int result = searchInsertPosition(arr, k);

        System.out.println(result);

    }

}
