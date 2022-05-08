// "static void main" must be defined in a public class.
/*
5. Print all triplet in an array which gives sum equal to k in O(n2).(Important)
Input  arr = {2, 4, 3, 7, 1, 8, 9, 0};
Output  0, 2, 4
        1, 2, 3
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 1, 8, 9, 0};
        int target = 6;
        threeSum(arr, target);
    }
    
    // Brute Force Solution - Time Complexity -> O(N^2)   Space Complexity -> O(1) 
    public static void threeSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){  
            int j = i+1;
            int k=arr.length - 1;
            int sum = 0;
            while(j<k){
                sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.print(arr[i]+ ", " + arr[j]+ ", " + arr[k]);
                    j++;
                    k--;
                    System.out.println();
                }
                else if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            } 
        }
    }
}
-------------------
Output -
0, 2, 4
1, 2, 3
