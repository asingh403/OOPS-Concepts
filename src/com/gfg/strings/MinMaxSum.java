package com.gfg.strings;

public class MinMaxSum {

    public static void minMax(int [] num){
        int sum1 = 0;
        int sum2 = 0;
        int len = num.length-1;
        for(int i=0; i<len; i++){
            sum1 += num[i];
            sum2 += num[i+1];
        }
        System.out.println(sum1+" : "+sum2);
    }

    public static void main(String[] args) {

        int [] input = {1, 3, 5, 7, 9};
        int [] in = {1, 2, 3, 4, 5};
        minMax(input);
        minMax(in);
    }
}
