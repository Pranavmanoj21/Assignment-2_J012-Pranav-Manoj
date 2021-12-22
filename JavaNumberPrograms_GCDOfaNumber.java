package com.mpstme;

import java.util.Scanner;

public class JavaNumberPrograms_GCDOfaNumber {
    public static void main(String[] args){
        // Java Number Programs: GCD of 2 Numbers Code
        int x, y, i, gcd = 1;
        Scanner fa = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = fa.nextInt(); // Getting value of x
        System.out.println("Enter the value of y: ");
        y = fa.nextInt(); // Getting value of y

        for (i = 1; i <= x && i <=y; i++ ){
            if(x%i == 0 && y%i == 0);
            gcd = i; //Storing value under gcd variable
        }
        System.out.println("The GCD of " + x + " and " + y + " is " + gcd);
    }
}
