public class Main {
    public static void main(String[] args) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0; i<n; i++){
            if(max1<arr[i]){
                max1 = Math.max(max1, arr[i]);
            }
        }
        
        for(int i =0; i<n; i++){
            if(arr[i]<max1){
                max2 = Math.max(max2, arr[i]);
            }
        }
        
        for(int i =0; i<n; i++){
            if(arr[i]<max2){
                max3 = Math.max(max3, arr[i]);
            }
        }
        System.out.println(max3);
    }
}
=====================
Input:-
10
1 2 3 4 5 6 7 8 9 12
Output :-
8
