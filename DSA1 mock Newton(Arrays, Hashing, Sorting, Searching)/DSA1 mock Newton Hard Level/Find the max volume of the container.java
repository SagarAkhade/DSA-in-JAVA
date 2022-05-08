// "static void main" must be defined in a public class.
/*
3. Find the max volume of the container. (Container with most area)
link - https://leetcode.com/problems/container-with-most-water/
Input: array = [3, 1, 2, 4, 5]   // GFG 
Output: 12
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        System.out.print("Max Area of Container is : " + maxArea(arr));
    }
    
    //Most optimal Solution -  Time Complexity -> o(N)  Space Complexity -> o(1)
    public static int maxArea(int[] arr){ 
        int left = 0;   
        int right = arr.length - 1;         
        int area = 0;
        while(left < right){
            area = Math.max(area, Math.min(arr[left], arr[right]) * (right - left));
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}
-----------
Output -
Max Area of Container is : 12
