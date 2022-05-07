// "static void main" must be defined in a public class.
/*
2d array matrix of n*n then you need to out put the spiral path of the 2d array
1 2 3
4 5 6
7 8 9
[1,2,3,6,9,8,7,4,5]
*/
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = matrix.length ;
        int c = matrix[0].length;
        spiral(matrix, r, c);
    }
    
    // Most Optimal Solution - Time Complexity->O(n) Space Complexity->O(n) 
    public static void spiral(int[][] matrix, int r, int c){
        int k=0; // for iterating rows
        int l=0; //for iterating cols
        int i;
        while(k<r && l<c){
            for(i=l; i<c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i=k; i<r; i++){
                System.out.print(matrix[i][c-1] + " ");
            }
            c--;  //c=1
            if(k<r){
                for(i=c-1; i>=l; i--){
                System.out.print(matrix[r-1][i] + " ");
                }
                r--;
            }
            
            if(l<c){
                for(i=r-1; i>=k; i--){
                System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
}
-------------------------
Output - 
1 2 3 6 9 8 7 4 5
