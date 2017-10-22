package com.company;

public class Main {

    public static void main(String[] args) {

        //Static arrays. You set the values when you create the array.
        int[] myArray = {1,2,3,4};
        String[] myStringArray = {"hello","hi","what","the ..."};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Item #" + myArray[i]);
            System.out.println("Name is " + myStringArray[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("next set of arrays");
        System.out.println();
        System.out.println();

        //More flexible arrays. You set the capacity and define the contents later.
        int[] newArray = new int[5];
        String[] newStringArray = new String[5];

        //and now you set the contents at position [] = value
        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 5;
        newArray[3] = 1;
        newArray[4] = 2;

        newStringArray[0] = "Dave";
        newStringArray[1] = "Sara";
        newStringArray[2] = "Jim";
        newStringArray[3] = "Jack";
        newStringArray[4] = "Ali";

        //Arrays have lengthS
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Item #" + newArray[i]);
            System.out.println("Name is " + newStringArray[i]);
        }
    }
}