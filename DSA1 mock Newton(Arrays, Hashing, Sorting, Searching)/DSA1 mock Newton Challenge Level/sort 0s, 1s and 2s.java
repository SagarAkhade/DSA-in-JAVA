// "static void main" must be defined in a public class.
/*
2. Given an integer array of 0s, 1s and 2s, sort the array without using
 count, hash maps, extra space and time complexity should be O(n)
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 0, 2, 2};
        sort(arr);
        printArray(arr);
    }
    
    public static void sort(int[] arr){
        int i = 0;
        int j=0; 
        int k=arr.length - 1;
        while(i<=k){              //Time Complexity -> O(N)
            if(arr[i] == 0){      //Space Complexity -> O(1)
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 2){
                swap(arr, i, k);
                k--;
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
-------------------
Output -
0 0 1 1 2 2 2
