package com.mpstme;

import java.util.Scanner;

public class JavaNumberPrograms_Sum_nNaturalNumbers {
    // Java Number Programs: Sum of n Natural Numbers Code
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers: ");
        int n = sc.nextInt();

        int sum = n*((n+1)/2); //applying formula for sum of n natural numbers

        System.out.println("The sum of " + n + " natural numbers is " + sum);
    }

}
