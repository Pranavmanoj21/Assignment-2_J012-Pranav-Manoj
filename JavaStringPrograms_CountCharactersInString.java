package com.mpstme;

import java.util.Scanner;

public class JavaStringPrograms_CountCharactersInString {
    public static void main(String[] args){
        int i, count;
        String txt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or a sentence: ");
        txt = sc.nextLine(); // User enters a string, used nextLine so that it accepts how much ever words user enters.

        count = 0;

        for (i = 0; i < txt.length(); i++){
            if (txt.charAt(i) != ' ') // does not take into consideration spaces or empty characters
                count ++; //keeps count of the number of characters
        }
        System.out.println("The number of characters in the string you entered is: " + count + " .");
    }
}
