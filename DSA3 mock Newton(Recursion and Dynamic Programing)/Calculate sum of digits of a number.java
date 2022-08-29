/*
Q. Calculate sum of digits of a number
Input : 1234  Output: 10
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int num = 1234;
        sumOfDigits(num);
        System.out.println(sum);
    }
    
    public static int sum = 0;
    public static void sumOfDigits(int num) {
        if(num % 10 == 0) {
            return;
        }
        sum = sum + num % 10;
        sumOfDigits(num / 10);
    }
}
