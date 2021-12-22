package com.mpstme;

import java.util.Scanner;

public class JavaBasicPrograms_PrimeNumber {

    public static void main(String[] args) {
	// Java Basic Programs: Prime Number program in Java
        int i, m = 0, num, flag = 0;
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = prime.nextInt();
        m = num/2;

        if (num == 0|| num == 1) { // Checking if number entered is 0 or 1, which are not prime
            System.out.println("O and 1 are not prime numbers.");
        }
        else{
            for (i = 2; i <= m; i++){
                if (num % i == 0){ // Checking if division process gives a remainder as 0 or not
                    System.out.println(num + " is not a prime number.");
                }
                break;
            }
        }
        if (flag == 0){
            System.out.println(num + " is a Prime Number.");
        }

    }
}