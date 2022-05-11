Link -  https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
// "static void main" must be defined in a public class.
/*
21. Find the smallest positive number missing from an unsorted array
You are given an unsorted array with both positive and negative elements. 
You have to find the smallest positive number missing from the array in O(n) 
time using constant extra space. You can modify the original array.
Examples 
 Input:  {2, 3, 7, 6, 8, -1, -10, 15}
 Output: 1
 Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
 Output: 4
 Input: {1, 1, 0, -1, -2}
 Output: 2
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 8, -1, -10, 15};
        smallestPositiveNum(arr);
    }
    
    //Most Optimal Solution - Time Complexity -> O(N)   Space Complexity -> O(N)
    public static int smallestPositiveNum(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }        
        int i;
        for(i=1; i<arr.length+1; i++){
            if(!set.contains(i)){
                System.out.print(i);
                break;
            }
        }
        return i;
    }
}
----------
Output -
1
