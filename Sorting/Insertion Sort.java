public class Main {
    public static void main(String[] args) {
        System.out.println("Use of Insertion Sort!");
        int[] arr = new int[] {5, 1, 9, 2, 10};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
    static void printArray(int[] arr){  // Print an Array Elements
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void insertionSort(int[] arr){  // Logic of Insertion Sort
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
            
    }
}
======================
Output:-
Use of Insertion Sort!
5 1 9 2 10 
1 2 5 9 10
