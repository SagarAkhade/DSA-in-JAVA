// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/find-sum-of-factorials-till-n-factorial-1-2-3-n/
Q. Find sum of factorials till N factorial
Input: N = 5
Output: 153
Explanation: 1! + 2! + 3! + 4! + 5! = 1 + 2 + 6 + 24 + 120 = 153.

Input: N = 1
Output: 1
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(5));
        //Output : 153
    }
    //Recursive Approach
    public static int fac(int n) {            
        if( n <= 1) {
            return 1;
        }
        return n * fac(n-1);
    }   
    public static int sum(int terms) {     
        if(terms>0) {
            return (fac(terms) + sum(terms-1));
        }  
        return 0;
    }
    
    //Iterative Approach
    // public static int factorialSum1(int n) {
    //     int factorial = 1;
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         factorial = factorial * i;
    //         sum += factorial;
    //     }
    //     return sum;
    // }
}
