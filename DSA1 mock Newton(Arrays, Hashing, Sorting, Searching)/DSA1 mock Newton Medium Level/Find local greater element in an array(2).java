// "static void main" must be defined in a public class.
/*
14. Find local greater element in an array.
input - arr = [10, 5, 11, 4, 8, 7, 3]
Output - 10, 11, 8
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 4, 8, 7, 3};
        LocalGreater(arr);
    }
    
    // Most Optimal Solution
    public static void LocalGreater(int[] arr){  
        for(int i=0; i<arr.length; i++){   // Time Complexity -> O(N)
            if(i==0){                      // Space Complexity -> O(1)
                if(arr[i]>arr[arr.length-1] && arr[i]>arr[i+1]){
                    System.out.print(arr[i] + " ");
                }
            }
            else if(i>0 && i<arr.length - 1){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    System.out.print(arr[i] + " ");
                }   
            }
            else if(i == arr.length-1){
                if(arr[i]>arr[i-1] && arr[i]> arr[0]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    
}
--------------
Output -
10 11 8
