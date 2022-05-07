// Most frequent element in array
import java.util.Map.Entry;  // This JAVA library is important for Entry 
public class Main {
    public static int maxFrequency(int[] arr, int n){
        
        // HashMap ->  (Key) + (Value) pair   
        Map<Integer, Integer> map = new HashMap<>();  // This HashMap will store frequency
        
        for(int i=0; i<n; i++){
            int key = arr[i];
            if(map.containsKey(key)){   // Here we are putting values to HashMap
                int freq = map.get(key);   // map.get -> gets us value 
                freq++;
                map.put(key, freq);
            }
            else{
                map.put(key, 1);
            }
        }
        int maxCount = 0; 
        int result = -1;
        for(Entry<Integer, Integer> val : map.entrySet()){   // This is to transverse HashMap
            if(maxCount <= val.getValue()){
                maxCount = val.getValue();
                result = val.getKey();
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 1, 3, 2, 1, 2, 2, 2};
        int n = arr.length;
        System.out.println(maxFrequency(arr, n));
    }
}
--------------------------------
Output -
2
