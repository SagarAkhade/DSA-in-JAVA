// "static void main" must be defined in a public class.
/*
10. Write a function that takes in a non-empty array of integers and returns an array 
of the same length, where each element in the output array is equal to the product of 
every other number in the inout array.
int[] arr = {1, 2, 3, 4};
Output - 
24 12 8 6
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = findProduct(arr);
        printArray(result);
    }
    
    public static int[] findProduct(int[] arr){
        int[] result = new int[arr.length];
        int temp = 1;
        for(int i=0; i<arr.length; i++){  // for product of left elements
            result[i] = temp;             // Time Complexity -> O(N)
            temp = temp * arr[i];         // Space Complexity -> O(1)
        }
        temp = 1;
        for(int i=arr.length-1; i>=0; i--){   // for product of right elements
            result[i] = result[i]*temp;
            temp = temp * arr[i];
        }
        return result;
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
--------
Output -
24 12 8 6
