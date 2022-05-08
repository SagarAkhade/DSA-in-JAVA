// "static void main" must be defined in a public class.
/*
18. Remove duplicates from an array
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 5, 8, 1, 4, 1, 2, 3, 1};
        removeDublicates(arr);
    }
    
    // Most Obtimal Solution 
    public static void removeDublicates(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){                        //Time Complexity -> O(N)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);   //Space Complexity -> O(N)
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
        
        /* // This we can also traverse through map but only keys are accessible
        for(int val : map.keySet()){  
            System.out.print(val + " ");
        }
        */
    }
}
------
Output - 
1 2 3 4 5 8
