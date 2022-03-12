package com.deleteArray;

public class DeleteArray {
    public static int delArray(int[] arr, int ele) {
        int len = arr.length;
        int i;

        for(i=0; i<len; i++)
            if(arr[i]==ele)
                break;

            if(i==len) return len;

            for(int j=i; j<len-1; j++)
                arr[j] = arr[j+1];

        return (len-1);
    }

    public static void main(String[] args) {
        int in [] = {3, 7, 4, 1, 9, 3};
        //int in [] = {3};
        int n = 3;
        int newSizeOfArrayAfterDelete = delArray(in, n);
        System.out.println(newSizeOfArrayAfterDelete);
    }
}
