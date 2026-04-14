package com.pluralsight;

public class Format {
    public static void main(String[] args) {

      String formatName = formatName("Alicia","Diaz");
        System.out.println(formatName);
    }

    public static String formatName(String firstName,String lastName){
      return lastName + "," + firstName;

    }
}
