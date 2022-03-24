package com.leetcode.easy;

import java.util.Arrays;

public class SortingSentence_1859 {
    public static String sortingSentence(String s) {


        String[] str = s.split(" "); //splitting the String
        int len  = str.length;

        String[] ans = new String[len]; //array of sorted words
        for (String st : str) {
            int charLen = st.length() - 1;
            int i = Character.getNumericValue(st.charAt(charLen)) - 1;
            ans[i] = st.substring(0, st.length() - 1); //sorting the valus in an array


        }
        System.out.println(Arrays.toString(ans));
        s = "";
        for (String st : ans) {
            s = s + st + " "; // appending the word.
        }
        s = s.substring(0, s.length() - 1); //removing the last extra space.
        return s;
    }
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        String result = sortingSentence(str);
        System.out.println(result);
    }
}
