// "static void main" must be defined in a public class.
// Shortcut keys for sorting array elements in increasing and decreasing order
// Time Complexity -> O(N logN)
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {7, 10, 9, 5, -1, 8, 0, 2};
        System.out.print("Initial Array : \t     ");
        printArray(arr);
        
        // Arrays.sort(arr, 0, 5);  -> Sort elements from 0 to 5
        Arrays.sort(arr);
        System.out.print("Sorting in Incearing order : ");
        printArray(arr);
        
        System.out.print("Sorting in Decreasing order from 5 to 8: ");
        Arrays.sort(arr, 5, 8,  Collections.reverseOrder());    // Collections.reverseOrder() method sorting from index 5 to 8 
       printArray(arr);
        
        Arrays.sort(arr, 0, 5, Collections.reverseOrder()); 
        
        System.out.print("Sorting in Decreasing order : ");
        Arrays.sort(arr, Collections.reverseOrder());    // Collections.reverseOrder() method always requires on Integer array not on int
        printArray(arr); 
        //Collections.sort(freqs, Collections.reverseOrder());  -> This is used in Sets, ArrayList , etc
    }
    
    public static void printArray(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
---------
Output - 
Initial Array : 	     7 10 9 5 -1 8 0 2 
Sorting in Incearing order : -1 0 2 5 7 8 9 10 
Sorting in Decreasing order from 5 to 8: -1 0 2 5 7 10 9 8 
Sorting in Decreasing order : 10 9 8 7 5 2 0 -1
