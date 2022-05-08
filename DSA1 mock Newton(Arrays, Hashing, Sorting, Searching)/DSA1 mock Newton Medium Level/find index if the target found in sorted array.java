// "static void main" must be defined in a public class.
/*
6. Given a sorted array of distinct integers and a target value, return the index if 
the target is found. If not return the index where it would be if it were inserted in order
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8};
        int target = 5;
        System.out.println(search(arr, target));
    }
    
    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){                    // Time Complexity -> O(log N)
            int mid = low + (high-low)/2;    // Space Complexity -> O(1)
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
-----------------
output - 
2
