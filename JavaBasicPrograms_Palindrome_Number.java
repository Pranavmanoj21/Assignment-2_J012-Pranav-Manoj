package com.mpstme;

import java.util.Scanner;

public class JavaBasicPrograms_Palindrome_Number {
    public static void main(String[] args) {
        // Java Basic Programs: Palindrome Number program in Java
        int r, sum = 0, temp, num;
        Scanner palin = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = palin.nextInt();

        temp = num;
        while(num > 0){
            r = num%10;
            sum = (sum*10) + r;
            num = num/10;
        }
        if (temp == sum)
            System.out.println("It is a Palindrome number!");
        else
            System.out.println("It is not a Palindrome number...Try again.");
    }
}
