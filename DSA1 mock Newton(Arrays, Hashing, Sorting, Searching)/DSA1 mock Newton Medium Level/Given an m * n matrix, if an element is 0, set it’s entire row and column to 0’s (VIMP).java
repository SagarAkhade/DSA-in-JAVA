// "static void main" must be defined in a public class.
/*
7. Given an m * n matrix; if an element is 0, set it’s entire row and column to 0’s
Approach -> we first check the our first column contains 0 or not
         -> then we create dummy 1st row and 1st column to store where 
						in matrix it contains 0
         -> Then we traverse the matrix from back side-> if our dummy 1st row or 1st column
					  contains 0 we completly set corresponding row and column to zero And update
					  our 1st column to 0 if it contains 0
*/

public class Main { 
	// Driver function to test the above function
    public static void main(String args[] ){
                 
        int mat[][] = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0}};
                 
        System.out.println("Input Matrix :");
        printMatrix(mat);
             
        setZeroes(mat);
             
        System.out.println("Matrix After Modification :");
        printMatrix(mat);             
    }     
   
    // Striver Solution Approach-> Most Optimal soltution
    public static void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {      // Time Complexity -> O(N*M)
            if (matrix[i][0] == 0){           // Space Complexity -> O(1)
                col0 = 0;
            } 
            for (int j = 1; j < cols; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }                
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }                    
            }              
            if (col0 == 0){
                matrix[i][0] = 0;
            } 
        }
    }
 /* A utility function to print a 2D matrix */
    public static void printMatrix(int mat[][]){
        for (int i = 0; i < mat.length; i ++){
            for (int j = 0; j < mat[0].length; j ++){
                System.out.print( mat[i][j]+" " );
            }
                System.out.println("");
        }
    }              
}
---------------------------
Output -
Input Matrix :
1 1 1 1 
1 1 1 1 
1 1 1 0 
Matrix After Modification :
1 1 1 0 
1 1 1 0 
0 0 0 0
