package com.pluralsight;

public class CompareNumber {

    public static void main(String[] args) {

        System.out.println(isEven(7));

    }
        public static boolean isEven(int someNumber){
            if(someNumber %2 == 0){
                // positive number
                return true;

            } //negative number
            return false;

        }

}
