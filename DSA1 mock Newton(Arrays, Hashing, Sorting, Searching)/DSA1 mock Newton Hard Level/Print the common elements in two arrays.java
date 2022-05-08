// "static void main" must be defined in a public class.
/*
7. Given 2 arrays a1= 1,1,2,2,2,3,5 and s2 = 1,1,1,2,2,4,5; Print the common elements 
between them(Output 1,1,,2,2,5)
*/
public class Main {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,5};
        int[] brr={1,1,2,2,4,5};
        commonElements(arr, brr);
    }
    
    // Most Optimal Solution  Time Complexity -> O(N)  Space Complexity -> O(N) 
    public static void commonElements(int[] arr, int[] brr){
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int i=0; i<brr.length; i++){
            if(map.containsKey(brr[i])){
                System.out.print(brr[i] + " ");
                map.put(arr[i], (map.get(brr[i])-1));
            }
        }
    }
}
------------
Output -
1 1 2 2 5
