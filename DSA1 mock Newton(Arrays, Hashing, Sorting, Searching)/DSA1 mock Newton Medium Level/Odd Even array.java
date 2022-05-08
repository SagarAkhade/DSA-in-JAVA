// "static void main" must be defined in a public class.
/*
11. Sort the array in a way all odd numbers came first in ascending order and all 
even numbers came in descending order.
input arr = {1, 8, 7, 6, 5, 3, 2, 4, 9};
Output result = {1, 3, 5, 7, 9, 8, 6, 4, 2};
*/
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 8, 7, 6, 5, 3, 2, 4, 9};
        Integer[] result = sortOddEven(arr);
        printArray(result);
    }
    
    //  Most Obtimal Solution
    public static Integer[] sortOddEven(Integer[] arr){   // Time Complexity -> O(NlogN)  
        int oddelements = -1;                            // Space Complexity -> O(1)           
        for(int i=0; i<arr.length; i++){  // moving odd elements to left and even to right
            if(arr[i]%2 != 0){
                oddelements++;
                int temp = arr[i];
                arr[i] = arr[oddelements];
                arr[oddelements] = temp;
            }
        }
        // To use Collections.reverseOrder() -> array must be Integer type
        Arrays.sort(arr, 0, oddelements);
        Arrays.sort(arr, oddelements, arr.length, Collections.reverseOrder());
        return arr;
    }
    
    public static void  printArray(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
--------------
Output -
1 3 5 7 9 8 6 4 2
