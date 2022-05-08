public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 4, 2, 3};
        System.out.println("Frequency of Occurence of elements : ");
        freq(arr);
    }
    public static void freq(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        // for(int nums : arr){   // Both will work properly
        //     map.put(nums, map.getOrDefault(nums, 0) + 1);
        // }
        
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        
        // Traversing HashMap
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){   
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
         
    }
}
--------------
Output- 
Frequency of Occurence of elements : 
1 -> 3
2 -> 2
3 -> 2
4 -> 1
