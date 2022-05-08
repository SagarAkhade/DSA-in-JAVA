// "static void main" must be defined in a public class.
/*
12. Find the maximum repeated element from the array, if multiple elements have the same 
high-frequency return a big number.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 4, 4, 4, 3, 3, 3, 5, 5, };
        System.out.println("Max occuring element : " + maxOccurence(arr));
        //maxOccurence(arr);
    }
    
    public static int maxOccurence(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();   // Time Complexity -> O(N)
																								      // Space Complexity -> O(N)
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int maxCount = 0;
        int result = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //System.out.println("Key -> "+ entry.getKey() + " Value -> " + entry.getValue());
            if(maxCount <= entry.getValue() ){
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
-----------
Output -
Max occuring element : 5
