// "static void main" must be defined in a public class.
/*
Link: https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
Given weights and values of n items, put these items in a knapsack of capacity W to get
the maximum total value in the knapsack. In other words, given two integer arrays
val[0..n-1] and wt[0..n-1] which represent values and weights associated with n 
items respectively. Also given an integer W which represents knapsack capacity, 
find out the maximum value subset of val[] such that sum of the weights of this 
subset is smaller than or equal to W. You cannot break an item, either pick the 
complete item or don’t pick it (0-1 property).
Input: values = {60, 100, 120};    weights = {10, 20, 30};  W = 50;
Output: 220
*/
public class Main {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int n = values.length;
        System.out.println(knapSack(W, weights, values, n));
    }
    public static int knapSack(int W, int[] weights, int[] values, int n) {
        int[] dp = new int[W + 1];
        
        for(int i = 1; i <= n; i++) {
            for(int w = W; w >= 0; w--) {
                if(weights[i -1] <= w) {
                    dp[w] = Math.max(dp[w], dp[w - weights[i -1]] + values[i - 1]);
                }
            }
        }
        return dp[W];
    }
}
