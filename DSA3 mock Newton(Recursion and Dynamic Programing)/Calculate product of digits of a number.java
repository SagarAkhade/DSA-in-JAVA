// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/program-to-calculate-product-of-digits-of-a-number/
Q. calculate product of digits of a number
Input: n = 4513
Output: 60

Input: n = 5249
Output: 360
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(digitMultiplication(5249));
    }
    //Recursive approach
    public static int digitMultiplication(int n) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * digitMultiplication(n / 10); 
    }
    
    //Iterative approach
    public static int mul(int n) {
        int product = 1;
        while(n != 0){
            product = product * (n%10);
            n = n / 10;
        }
        return product;
    }
}
