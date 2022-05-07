public class Main {
    public static int getSecondLarge(int[] arr, int n){
        Arrays.sort(arr);   // Arrays.sort(arr) -> method for sorting elements 
        int secondLarge = arr[n-2];                // Time Complexity - O(NlogN)
        return secondLarge;
    }
    
    public static void main(String[] args) {
        int[] arr = {-2, 5, 5, 6, 7, 15};
        int n = arr.length;
        System.out.println("Second largest element in Array : " + getSecondLarge(arr, n));
    }
}
---------------------------
Output -
Second largest element in Array : 7
