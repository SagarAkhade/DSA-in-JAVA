// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/java-program-for-longest-common-subsequence/
Q. Longest Common Subsequence
Input: String1 = "AGGTAB";  String2 = "GXTXAYB"
Output: 4 
*/
public class Main {
    public static void main(String[] args) {
        String str1 = "AGGTAB"; 
        String str2 = "GXTXAYB";
        
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        int m = x.length;
        int n = y.length;
        
        System.out.println(lowestCommonSubsequence(x, y, m, n));
    }
    public static int lowestCommonSubsequence(char[] x, char[] y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if(x[i - 1] == y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;  
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    } 
}
