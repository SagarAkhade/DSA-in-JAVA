public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 0, 1, 2, 2, 1};
        //Arrays.sort(array);
        print(array);
        sort(array);
        print(array);
    }
    static void sort(int[] arr){   // Bubble sort
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j+1] <= arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }
}
-----------------
Output
0 1 0 0 1 2 2 1 
0 0 0 1 1 1 2 2
