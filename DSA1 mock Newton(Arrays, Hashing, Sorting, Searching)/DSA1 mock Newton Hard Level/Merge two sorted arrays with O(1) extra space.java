// "static void main" must be defined in a public class.
/*
Q. 19 Merge two sorted arrays with O(1) extra space
We are given two sorted arrays. We need to merge these two arrays such that the 
initial numbers (after complete sorting) are in the first array and the remaining 
numbers are in the second array. Extra space allowed in O(1).
Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
*/
public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 9, 10, 15, 20};
        int arr2[] ={2, 3, 8, 13};
        int m = arr1.length;
        int n = arr2.length;
        merge(arr1, arr2, m, n);
    }
    
    // Brute Force Approach Time Complexity -> O(NlogN)  Space Complexity -> O(1)
    public static void merge(int[] arr1, int[] arr2, int m, int n){
        int i=0;
        while(arr1[m-1] > arr2[0]){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }
        printArray(arr1);
        printArray(arr2);
    }
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
-------------------
Output 
1 2 3 5 8 9 
10 13 15 20
