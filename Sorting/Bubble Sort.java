public class Main {
    public static void main(String[] args) {
        System.out.println("Sorting a Array element using Bubble sort!!!");
        int[] arr = { 1, 5, 3, 9, 8, 7, 6};
        int n = arr.length;
        System.out.print("Unsorted Arrays : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        boolean isSwapped;
        for(int i=0; i<n-1; i++){     // Here we are using Bubble sort logic. It simply swapping technique
            isSorted = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped = false){
                break;
            }
        }
        System.out.println();
        System.out.print("Sorted Arrays   : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
=====================
Output :-
Sorting a Array element using Bubble sort!!!
Unsorted Arrays : 1 5 3 9 8 7 6 
Sorted Arrays   : 1 3 5 6 7 8 9
