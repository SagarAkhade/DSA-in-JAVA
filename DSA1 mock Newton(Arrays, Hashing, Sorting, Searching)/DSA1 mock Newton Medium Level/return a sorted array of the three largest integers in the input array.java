// "static void main" must be defined in a public class.
/*
9. Write a function that takes in an array of at least three integers, 
and without sorting the input array, return a sorted array of the three 
largest integers in the input array.
Input - arr = {1, 2, 5, 9, 7, 9, 12, 20};
Output - result = {9, 12, 20}
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 7, 9, 12, 20};
        System.out.println("Three Largest Elements : ");
        int[] result = threeLargest(arr);
        printArray(result);
    }
    
    public static int[] threeLargest(int[] arr){
        int[] result = new int[3];
        int max1, max2, max3;
        max1 = max2 = max3= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){       // Time Complexity -> O(N)
            max1 = Math.max(arr[i], max1);     // Space Complexity -> O(1)
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max1){
                max2 = Math.max(arr[i], max2);
            } 
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max1 && arr[i]<max2){
                max3 = Math.max(arr[i], max3);
            } 
        }
        result[0] = max3;
        result[1] = max2;
        result[2] = max1;
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
Three Largest Elements : 
9 12 20
