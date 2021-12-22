package com.mpstme;

import java.util.Scanner;

public class JavaStringPrograms_NumberOfVowels_Consonants {
    public static void main(String[] args) {
        int i;
        String txt;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        txt = sc.next();
        txt = txt.toLowerCase(); // converting all uppercase to lowercase to ease the process

        int count1 = 0; // count1 stores count of number of vowels
        int count2 = 0; // count2 stores count of number of consonants

        for (i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
                count1++;
            } else if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z') {
                count2++;
            }
        }
        System.out.println("The Number of vowels used is " + count1 + " and the number of consonants used is " + count2 + " .");
    }
}

