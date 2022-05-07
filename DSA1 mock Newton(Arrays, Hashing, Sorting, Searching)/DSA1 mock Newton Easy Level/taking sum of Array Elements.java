//Time Complexity for this program is O(N)
public class Main {
    public static int sumArray(int[] arr){     // Time Complexity- O(N)
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr));
    }
}
------------------------
Output :-
10
