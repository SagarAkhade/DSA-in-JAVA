// "static void main" must be defined in a public class.
/*
9. Shift zeroes to end of the array
Input arr = {1, 0, 2, 0, 0, 5, 0, 7};
Output - {1, 2, 5, 7, 0, 0, 0, 0};
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 5, 0, 7};
        shiftZeros(arr);
        printArray(arr);
    }
    
    // Optimal Solution - Time Complexity -> O(n)  Space Complexity -> O(1)
    public static void shiftZeros(int[] arr){
        int j=0;  // j takes positive value
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }        
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
----------
Output -
1 2 5 7 0 0 0 0
