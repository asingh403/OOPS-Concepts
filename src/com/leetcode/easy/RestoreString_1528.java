package com.leetcode.easy;

public class RestoreString_1528 {
    public static String restoreString(String s, int[] indices){

        char [] arr = new char[s.length()];
        for(int i=0; i<s.length();i++){
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args) {

        int [] indices = {3,4,5,6,7,0,1,2};
        String str = "delhinew";
        System.out.println(restoreString(str, indices));
    }
}
