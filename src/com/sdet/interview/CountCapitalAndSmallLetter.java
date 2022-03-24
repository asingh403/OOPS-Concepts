package com.sdet.interview;

public class CountCapitalAndSmallLetter {

    public static String countCapitalAndSmall(String str){

        int capsCount = 0;
        int smallCount = 0;

        for(char c:str.toCharArray()){

            if(c>= 65 && c<=90 ){
                capsCount++;
            }else{
                smallCount++;
            }

        }

        String res = "Number of small Chars : "+ Integer.toString(smallCount)+
                     ". Number of Caps Chars : " + Integer.toString(capsCount) +
                     ". Total chars count in String : "+ str.length();

        return res;
    }

    public static void main(String[] args) {
        String result = countCapitalAndSmall("DelhiIs");

        System.out.println(result);
    }
}