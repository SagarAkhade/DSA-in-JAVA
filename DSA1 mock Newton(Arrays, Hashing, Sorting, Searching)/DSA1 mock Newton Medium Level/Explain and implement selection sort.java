/*
- In selection sort we divide an array into two parts Sorted & Unsorted part
- We repeatedly find minimum element in unsorted part and make it part of sorted part
- **Time Complexity → O(N^2)    Space Complexity → O(N)**
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Implementation of Selection Sort!");
        int[] arr = {5, 6, 8, 1, 6, -2};
        selectionSort(arr);
        printArray(arr);
    }
    
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
-----------
Output -
Implementation of Selection Sort!
-2 1 5 6 6 8
