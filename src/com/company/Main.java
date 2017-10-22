package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {1,2,3,4};
        String[] myStringArray = {"hello","hi","what"};

        //Arrays have length
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Item #" + myArray[i]);
        }
    }
}