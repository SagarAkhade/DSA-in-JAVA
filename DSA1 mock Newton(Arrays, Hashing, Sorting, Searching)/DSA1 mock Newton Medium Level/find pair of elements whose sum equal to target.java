// "static void main" must be defined in a public class.
// 2, 7, 4, 5, 6, 3, 9
// sum = 9

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 6, 3, 9};
        int target = 9;
        System.out.println("Elements of two pairs whose sum equal to target : ");
        sumElements(arr, target);
        System.out.println("Elements of three pairs whose sum equal to target : ");
        tripplet(arr, target);
    }
    
    public static void sumElements(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        int j=n-1;

        while(i<j){                      //Time complexity -> O(N) 
            int sum = arr[i] + arr[j];
            if(sum == target){
                System.out.print(arr[i] + " " + arr[j]);
                System.out.println();
                i++;
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
    
    
    public static void tripplet(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){  // Time Complexity -> O(N^2)
            int j = i+1;
            int k = arr.length - 1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.print(arr[i] +", " +arr[j] +", "+ arr[k]);
                    j++;
                    k--;
                    System.out.println();
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
    
    public static void sumTwo(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;               // Time complexity -> O(N^2)
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print(arr[i] +  " "+arr[j]);
                    System.out.println();
                }
            }
        }
    }
}
----------------------
Output -
Elements of two pairs whose sum equal to target : 
2 7
3 6
4 5
Elements of three pairs whose sum equal to target : 
2, 3, 4
