// "static void main" must be defined in a public class.
/*
8. Sort a binary array in O(n)
Input - arr = {0, 1, 1, 0, 1};
output - arr = {0, 0, 1, 1, 1}
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1};
        System.out.println("Input Array : ");
        printArray(arr);

        System.out.println("Array After Sorting : ");
        sortBinaryArray(arr);
        printArray(arr);
    }
    
    public static void sortBinaryArray(int[] arr){
        int j = -1;
        for(int i=0; i<arr.length; i++){  // Time Complexity -> O(N)
            if(arr[i] < 1){               // Space Complexity -> O(1)
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
---------------------
Output - 
Input Array : 
0 1 1 0 1 
Array After Sorting : 
0 0 1 1 1
