package com.mpstme;

public class JavaMatrixPrograms_UpperTriangularMatrix {
    public static void main(String[] args) {
        // Java Matrix Programs: Displaying upper triangular matrix
        int r, c;
        int a[][] = {{21, 42, 64}, {87, 10, 12}, {14, 16, 18}};
        r = a.length;
        c = a[0].length;

        if (r != c) { // Checking if the no. of rows and columns are same, i.e if it is a square matrix or not
            System.out.println("The matrix entered is not a Square matrix. Try Again.");
        } else {
            System.out.println("The Upper Triangular Matrix of the entered is:-");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i > j) {
                        System.out.print("0 "); // If row index is greater than column index, replace it with 0
                    } else {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
