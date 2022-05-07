// Move negative elements on one side of arr
public class Main {
    public static void moveNegative(int[] arr, int n){
        int j=0;
        for(int i=0; i<n; i++){        // Time complexity- O(N)
            if(arr[i]>=0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]>0){
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {-1, 2, 5, -9, -7, 8, -3};
        int n = arr.length;
        moveNegative(arr, n);
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
-----------------
Output -
2 5 8 -9 -7 -1 -3
