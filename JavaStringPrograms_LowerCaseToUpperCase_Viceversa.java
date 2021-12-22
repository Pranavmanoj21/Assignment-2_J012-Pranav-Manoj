package com.mpstme;

public class JavaStringPrograms_LowerCaseToUpperCase_Viceversa {
    public static void main(String[] args){
        String a = "Pranav Manoj";
        StringBuffer newStr = new StringBuffer(a);

        for (int i = 0; i < a.length(); i++){
            if (Character.isLowerCase(a.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(a.charAt(i))); // if letter is lowercase, convert it to uppercase letter
            }
            else if(Character.isUpperCase(a.charAt(i))){
                newStr.setCharAt(i, Character.toLowerCase(a.charAt(i))); // if letter is uppercase, convert it to lowercase letter
            }
        }
        System.out.println("String entered after conversion is " + newStr + " .");

    }
}
