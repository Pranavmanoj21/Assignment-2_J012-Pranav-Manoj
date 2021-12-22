package com.mpstme;

public class JavaMatrixPrograms_TransposeMatrix {
    public static void main(String[] args){
        // Java Matrix Programs: Displaying Transpose Matrix
        int a[][] = {{1, 3, 5}, {2, 4, 6}, {5, 7, 9}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        int tran[][] = new int[3][3]; //Storing new transpose matrix as 3x3 matrix, in variable tran

        System.out.println("The Transpose of the original matrix will be:-");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tran[i][j] = a[j][i]; // Changing the indexing of elements to switch the respective positions
                System.out.print(tran[i][j] + " ");
            }
            System.out.println();
        }


    }
}
