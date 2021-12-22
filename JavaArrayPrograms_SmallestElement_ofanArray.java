package com.mpstme;

public class JavaArrayPrograms_SmallestElement_ofanArray {
    public static void main(String[] args){
        // Java Array Programs: Finding the smallest element of the array.
        int i, j = 0, total = 0, temp = 0;
        int a[] = {1, 2, 3, 4, 55, 66};
        System.out.println("The array entered is: ");
        for (i = 0; i < a.length; i++){
            System.out.println(a[i] + "");
        }
        for (i = 0; i < total; i++){
            for(j = i + 1; j < total; j++){ // comparing an element and checking its immediate successor element
            if (a[i] < a[j])
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            }
            }
        System.out.println("The smallest element in the given array: ");
        System.out.println(a[j]);
        }
    }

