package com.sdet.interview;

public class CountAlphaSplCharsDigit {

    public static String countAlphaSplCharsDigit(String str){

        int alpha = 0;
        int nums = 0;
        int spl = 0;

        // 65-90 and 97 to 122 -- alpha
        // 48 - 57 = Numeric

        for(char c:str.toCharArray()){
            if(c>=65 && c <= 90 || c >= 97 && c <= 122){
                alpha++;
            }
            else if(c>= 48 && c <= 57){
                nums++;
            } else {
                spl++;
            }
        }

        //spl = str.length() - (alpha+nums);

        return "Alpha Count :: "+Integer.toString(alpha)+
                " Numeric Count :: "+
                    Integer.toString(nums) +
                        " : Spl count :: "+Integer.toString(spl) +
                                " : Total count "+ str.length();


    }

    public static void main(String[] args) {
        String st = "luck12now5$%^#";
        String result = countAlphaSplCharsDigit(st);

        System.out.println(result);
    }


}

//luck12now5$%^# : 7-Alpha, 3-Digit, 4 - spl chars = total 14