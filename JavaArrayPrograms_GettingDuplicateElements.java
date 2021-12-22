package com.mpstme;

public class JavaArrayPrograms_GettingDuplicateElements {
    public static void main(String[] args){
        // Java Array Programs: Getting second-largest element of an array
        int i, j;
        int [] arr = new int[] {1, 2, 2, 3, 4, 4, 3, 5, 6}; // Original array
        System.out.println("The Original Array entered is: ");
        for (i = 0; i < arr.length; i++){
            System.out.println(arr[i] + ""); // Printing the original array
        }
        System.out.println("The duplicate elements in the array is/are: ");
        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]) // Checking if the elements are same
                    System.out.println("The duplicate elements are " + arr[j]); //printing the repeated elements
            }
        }
    }
}
