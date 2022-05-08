// "static void main" must be defined in a public class.
/*
13. Find all pairs whose elements sum is equal to the target sum.
*/
public class Main {
    public static void main(String[] args){
        int A[] = { 1, 4, 6, 10, 8, 8 };
        int target = 16;
        printpairs(A, target);
    }

     static void printpairs(int arr[], int sum){       // Most Optimal Solution
        HashSet<Integer> set = new HashSet<Integer>();   // Time Complexity -> O(N) 
        for (int i = 0; i < arr.length; i++){            // Space Complexity -> O(N)
            int temp = sum - arr[i];
            // checking for condition
            if (set.contains(temp)) {
                System.out.println(temp +" "+ arr[i]);
            }
            set.add(arr[i]);
        }
    }

    public static void sumPair(int[] arr, int target){     // Brute Force Solution
        for(int i=0; i<arr.length-1; i++){               // Time Complexity -> O(N^2)
            for(int j=i+1; j<arr.length; j++){          // Space Complexity -> O(1)
                if(arr[i]+ arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    
    public static void sumPair1(int[] arr, int target){   // Optimal Solution 
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start < end){                         // Time Complexity -> O(NlogN)
            int sum = arr[start] + arr[end];       // Space Complexity -> O(N)
            if(sum == target){
                System.out.println(arr[start] + " " + arr[end]);
                start++;
                end--;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
    }
}
----------------
Output - 
6 10
8 8
