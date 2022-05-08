/*
Explanation - In Selection Sort we divide array into two parts- Sorted and Unsorted .

- We pick minimum element from Unsorted  part and Swap it with leftmost part and unsorted part. After Swap element now become part of Sorted part. 

Time Complexity - **O(N^2)**    Space Complexity - **O(1)**
*/
public class Main {
    public static void selectionSort(int[] arr){  // Algorithm for Selection Sort
        int n = arr.length;
        for(int i=0; i<n-1; i++){      //Time Complexity - O(N^2)
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArray(int[] arr){     //Printing Array Element
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, -9, 8};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
-----------------
Output-
1 5 3 -9 8 
-9 1 3 5 8
