// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 1, 3, 2, 1, -2, -2, -2, -2, -2, -2, -2};
        System.out.println(maxFreq(arr));
    }
    
    public static int maxFreq(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        
        // for(int nums : arr){
        //     map.put(nums , map.getOrDefault(nums , 0) + 1);
        // }
        
        for(int i=0; i<arr.length; i++){  // Both will work 
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        int maxCount = 0; 
        int result = -1;
        for(Map.Entry<Integer, Integer> vals : map.entrySet()){
            if(maxCount <= vals.getValue()){
                maxCount = vals.getValue();
                result = vals.getKey();
            }
        }
        return result;
    }
}
-------------------
Output - 
-2
