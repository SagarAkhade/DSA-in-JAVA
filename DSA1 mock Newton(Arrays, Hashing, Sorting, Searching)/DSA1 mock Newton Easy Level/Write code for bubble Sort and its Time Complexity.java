//Time complexity  for bubble sort is O(N^2)
  public class Main {
    public static void bubbleSort(int[] arr){  // Algorithm for Buuble Sort
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] arr){   // Printing Array Element
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, -9};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
--------------
Output :-
1 5 2 3 -9 
-9 1 2 3 5
