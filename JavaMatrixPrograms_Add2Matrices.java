package com.mpstme;

public class JavaMatrixPrograms_Add2Matrices {
    public static void main(String[] args){
        // Java Matrix Programs: Adding 2 matrices
        int a[][] = {{1, 2, 3}, {2, 3, 4},{3, 4, 5}};
        int b[][] = {{10, 9, 8}, {9, 8, 7}, {8, 7, 6}};

        int c[][] = new int[3][3]; //a 3 x 3 matrix as final output

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j]; // adding the respective values of both a and b matrices
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
