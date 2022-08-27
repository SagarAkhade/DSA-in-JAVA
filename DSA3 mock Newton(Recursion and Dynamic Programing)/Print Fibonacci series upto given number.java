// "static void main" must be defined in a public class.
/*
Q. Print fibonacci series upto given number
Input: 6 
Output: 0 1 1 2 3 5
Fibonacci Series : 0 1 1 2 3 5 8 13 21 34....
*/
public class Main {
     public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
	      if(n == 1 || n == 2){
			    return 1;
		    }
	      return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	  }
    
    public static void main(String args[]) {
        int maxNumber = 10;
        for(int i = 0; i < maxNumber; i++){
                System.out.print(fibonacciRecursion(i) +" ");
        }
        // Output: 0 1 1 2 3 5 8 13 21 34 
	  }
}
