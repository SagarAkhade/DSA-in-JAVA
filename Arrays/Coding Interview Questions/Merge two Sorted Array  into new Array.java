package com.company;

// Q. Merge two Sorted Array  into  new Array
public class A_3_Arrays_9_Merge_Two_Sorted_Array {
    static void printArray(int[] arr){  // This Method is used for printing an Array Elements
        int n = arr.length;  // arr.length used to give size of an Array
        for(int i=0; i<n; i++){               // Time complexity O(n) and Space Complexity O(1)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] merge(int[] arr1, int[] arr2, int n, int m){   // This is algorithm to Merge Two Sorted Array
        int[] result = new int[n + m];
        int i =0; // traverse arr1
        int j =0; // traverse arr2
        int k = 0;   // traverse result
        while(i<n && j<m){    // Boundary conditions
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // if either arr1 got exhausted or arr2 got exhausted
        while(i<n){        // Here we arr2 got exhausted
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){        // Here we arr1 got exhausted
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {0, 1, 8, 10};
        int [] arr2 = {2, 4, 11, 15, 20};
printArray(arr1);
printArray(arr2);
        int[] result =merge(arr1, arr2, arr1.length, arr2.length);
printArray(result);
    }
}
----------------------
Output :-
0 1 8 10 
2 4 11 15 20 
0 1 2 4 8 10 11 15 20
