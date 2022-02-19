package com.oops.exception_handling;

public class TryCatchBlock {

    String name;

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        TryCatchBlock obj = new TryCatchBlock();
        obj.name = "tom";
        obj = null;

        try {
            System.out.println(obj.name); //it will trow NPE
            int i = 9/3;
            System.out.println("Hi !!");
            System.out.println("Hi !!");
            System.out.println("Hi !!");
        }

//        catch (Exception e){
//            System.out.println("Some Exception is coming.");
//            e.printStackTrace();
//        }

        catch (ArithmeticException e){
            System.out.println("Some exception is coming ");
            e.printStackTrace();
        }
        catch (NullPointerException e){
            System.out.println("NPE -- Null Pointer Exception is coming.");
        }

        System.out.println("B");
        System.out.println("B");
        System.out.println("B");

    }
}
