package com.mpstme;

import java.util.Scanner;

public class JavaNumberPrograms_ReverseNumber {
    public static void main(String[] args) {
        // Java Number Programs: Reverse Number Code

        int num, remainder, reverse = 0;
        Scanner rev = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = rev.nextInt(); //Taking input from user

        while (num != 0) {
            remainder = num % 10; //Taking the remainder by dividing with 10
            reverse = (reverse*10) + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
