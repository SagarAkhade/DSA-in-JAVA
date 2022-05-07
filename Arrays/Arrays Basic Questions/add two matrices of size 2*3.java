// Question 4 :- Write a JAVA program to add two matrices of size 2*3
// i.e. adding corresponding elements of matrices
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for(int i=0; i<mat1.length; i++){  // row number of times
            for(int j=0; j<mat1[i].length; j++){ // column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
==========================
Output :-
3 8 16 
7 12 7
