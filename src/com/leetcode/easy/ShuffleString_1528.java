package com.leetcode.easy;

public class ShuffleString_1528 {

    public static String restoreString(String s, int[] indices) {
        char [] res = new char[s.length()];
        for (int i=0; i<indices.length; i++){
             res[indices[i]]=s.charAt(i);
        }
        return new String(res);
    }

    public static void main(String[] args) {
        //String s = "codeleet";
        String s = "DelhiNew";
        //int [] indices = {4,5,6,7,0,2,1,3};
        int [] indices = {3,4,5,6,7,0,1,2};
        String result = restoreString(s, indices);
        System.out.println(result);
    }
}
