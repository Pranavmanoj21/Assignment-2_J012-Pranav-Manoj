package com.mpstme;

import java.util.Scanner;


public class JavaBasicPrograms_Factorial_Number {

    public static void main(String[] args) {
        // Java Basic Programs: Factorial number program in Java
        int i, number, fact = 1;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        number = num.nextInt();

        for (i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("The factorial of " + number + " is " + fact + ".");
    }
}
