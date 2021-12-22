package com.mpstme;

import java.util.Scanner;

public class JavaArrayPrograms_ReverseArray {
    public static void main(String[] args){
        // Java Array Programs: Printing reverse of an array
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("The Array in the original order is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Array you entered in Reverse order is: ");
        for (int i = arr.length-1; i >= 0; i--) { // reversing the order of array
            System.out.print(arr[i] + " ");
        }
    }
}