package com.common.interview.ques;

public class SumOfPalindrome {

    public static String sumOfPalindrome(String str){
        int b = 0;
        int e = str.length()-1;
        while(b<e){
            if(str.charAt(b) != str.charAt(e)){
                return "invalid palindrome";
            } else {
                b++;
                e--;
            }
        }
        return "valid palindrome";
    }
    public static void main(String[] args) {

        String input = "ab11ba1";
        String result  = sumOfPalindrome(input);
        System.out.println(result);
    }
}
