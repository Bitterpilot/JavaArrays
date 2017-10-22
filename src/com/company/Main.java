package com.company;

public class Main {

    public static void main(String[] args) {

        //Static arrays. you set the values when you create the array
        int[] myArray = {1,2,3,4};
        String[] myStringArray = {"hello","hi","what"};

        //More flexible arrays. you set the capacity
        int[] newArray = new int[5];
        String[] newStringArray = new String[5];

        //and now you set the contents at position [] = value
        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 5;
        newArray[3] = 1;
        newArray[4] = 2;
        newArray[5] = 6;

        //Arrays have length
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Item #" + newArray[i]);
        }
    }
}