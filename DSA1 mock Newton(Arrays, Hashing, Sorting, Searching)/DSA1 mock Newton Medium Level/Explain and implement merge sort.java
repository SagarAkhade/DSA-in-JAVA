/*
- Merge sorte is divide and conqure algorithm.
- **Divide** - In merge sort the array is divided in two halves. And division of array is done until there is no more half arrays to divide
- **Conqure** - In conquring starting from bottom we sort elements and merge them to get sorted array
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Merge Sort Implementation!");
        int[] arr = {-1, 5, 6, 0, 8, -6, 2};
        int[] temp = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        
        mergeSort(arr, temp, low, high);
        printArray(arr);
    }
    
    public static void mergeSort(int[] arr, int[] temp, int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }
    
    public static void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        int i=low, j=mid+1, k=low;
        while(i<=mid && j<=high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
------------------
Output -
Merge Sort Implementation!
-6 -1 0 2 5 6 8
