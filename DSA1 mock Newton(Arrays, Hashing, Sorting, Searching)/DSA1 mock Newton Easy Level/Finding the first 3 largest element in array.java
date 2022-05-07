public class Main {
    public static void main(String[] args) {
        System.out.println("Find first 3 largest element in Array!");
        int[] arr = {1, 5, 2, 55, 19, 28, 75, 88};
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max1 = Math.max(arr[i] , max1);
        }
        for(int i=0; i<n; i++){
            if(arr[i]<max1){
                max2 = Math.max(arr[i] , max2);
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]<max1 && arr[i]<max2){
                max3 = Math.max(arr[i] , max3);
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
-----------------------
Output :-
Find first 3 largest element in Array!
88
75
55
