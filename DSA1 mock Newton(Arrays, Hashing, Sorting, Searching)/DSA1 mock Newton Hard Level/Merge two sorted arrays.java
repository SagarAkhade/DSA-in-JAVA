// "static void main" must be defined in a public class.
/*
2. Merge two sorted arrays
Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
*/
public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int m = arr1.length;
        int n = arr2.length;
        mergeTwoSorted(arr1, arr2, m, n);
    }
    
    //Brute Force Approach
    public static void mergeTwoSorted(int[] arr1, int[] arr2, int m, int n){
        int[] result = new int[m+n];    // Time Complexity -> O(m+n); 
        int i = 0, j=0, k=0;            // Space Complexity -> O(m+n); 
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k] = arr2[j];
            j++;
            k++;
        }
        printArray(result);
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }  
}
------------
Output - 
1 2 3 4 4 5 6 8
