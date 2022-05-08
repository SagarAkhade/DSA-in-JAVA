// link - https://leetcode.com/problems/reduce-array-size-to-the-half/
// "static void main" must be defined in a public class.
/*
12. You are given an integer array. You can choose a set of integers and remove all the 
occurrences of integers in the array. Return the minimum size of the set so that atleast 
half of the integers of the array are removed. 
Input = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7}. Output = 2.
Explanation : Choosing {3, 7} will make the new array [5, 5, 5, 2, 2] which has size 5 
(i.e equal to half of the size of the old array). Possible sets of size 2 are 
{3, 5},{3,2},{5,2}. Choosing set {2, 7} is not possible as it will make the new array
{3,3,3,3,5,5,5} which has a size greater than half of the size of old array.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(minSetSize(arr));
    }
    
// Optimal Solution Time Complexity -> O(NlogN)  Space Complexity -> O(N)
    public static int minSetSize(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        // We are putting key-value pair in HashMap
        for(int i=0; i<n; i++){         
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        // We putting freq of our HashMap in ArrayList in decreasing order
        List<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs, Collections.reverseOrder());   // For sorting elements in reverse order
        
        int count = 0;
        int totalEl = n;
        int i = 0;
        while(totalEl > n/2){
            totalEl = totalEl - freqs.get(i);
            i++;
            count++;
        }
        return count; 
    }
}
------
Output - 
2
