package com.common.interview.ques;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Delhi";
        int len  = s.length()-1;
        String rev="";

        for(int i= len; i>=0; i--){
            rev += s.charAt(i);
        }

        System.out.println(rev);

    }

}
