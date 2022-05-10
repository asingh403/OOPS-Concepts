package com.common.interview.ques;

public class CharCountWithSet {
    public static void main(String[] args) {

        int CHAR = 256;
        String str = "pyaahppl";

        int len = str.length();
        int counter[] = new int[CHAR];

       for (int i=0; i<len; i++){
           counter[str.charAt(i)]++;
       }

       for(int j=0; j<CHAR; j++){
           if(counter[j] >= 1){
               System.out.println((char)j+ " : "+counter[j]);
           }
       }
    }
}
