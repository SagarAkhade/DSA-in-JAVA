// "static void main" must be defined in a public class.
/*
Link: https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
Q. Program for Fibonacci numbers
Input  : n = 2
Output : 1
Input  : n = 9
Output : 34
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciMemo(new int[9 + 1], 9));
        //Output : 34
        
        // System.out.println(fibonacciTab(9));
        // System.out.println(fibonacciRec(9));
    }
    //Fibonacci number using DP (bottom top Tabulation approach)
    public static int fibonacciTab(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i - 2];
        }
        return table[n];
    }
    //Fibonacci number using DP (top bottom Memoization approach)
    public static int fibonacciMemo(int[]dp, int n){
        if(dp[n] == 0) {
            if(n < 2) {
                dp[n] = n;
            } 
            else {
                int left = fibonacciMemo(dp, n - 1);
                int right = fibonacciMemo(dp, n - 2);
                dp[n] = left + right;
            }
        }
        return dp[n];
    }
    
    //Fibonacci number using Recursion
    public static int fibonacciRec(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
