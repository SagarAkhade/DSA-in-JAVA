// "static void main" must be defined in a public class.
/*
4. Next Larger element in O(n)
Input arr = [13, 7, 6, 12]
Output [-1 12 12 -1 ]
Optimized using Stack will see later
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 12};
        nextGreater(arr);
    }
    // Brute Force Approach - Time Complexity -> O(N^2)   Space Complexity -> O(1)
    public static void nextGreater(int[] arr){    
        for(int i=0; i<arr.length; i++){
            int next = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next + " ");
        }
    }
}
-------------
Output - 
-1 12 12 -1
