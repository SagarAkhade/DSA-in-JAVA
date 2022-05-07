package com.company;

// Q. Print given matrix in Spiral form | coding Interview Question  
public class A_3_Arrays_14_Print_Given_Matrix_In_Spiral_Form {
    public static void spiralPrint(int[][] matrix, int r, int c){
        int i, k=0, l=0;
        while(k<r && l<c) {
            for (i = l; i < c; i++) {    // for printing from left --> right
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < r; i++) {    // for printing from top --> bottom
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if (k < r) {
                for (i = c - 1; i >= l; i--) {   // for printing from right --> left
                    System.out.print(matrix[r - 1][i] + " ");
                }
                r--;
            }
            if (l < c) {
                for (i = r - 1; i >= k; i--) {  // for printing from bottom --> top
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix ={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int r = 4;     // no. of rows
        int c = 4;     // No.  of cols
        for(int i=0; i<matrix.length; i++){       // Printing the matrix
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Spiral form of matrix is : ");
        spiralPrint(matrix, r, c);
    }
}
------------------
Output -
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 
The Spiral form of matrix is : 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
