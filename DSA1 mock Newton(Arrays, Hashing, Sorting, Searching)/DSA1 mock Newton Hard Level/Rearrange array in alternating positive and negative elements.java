// "static void main" must be defined in a public class.
/*
16. Rearrange array in alternating positive and negative elements without extra space 
and in O(n). Input = {1, 2, 3, -4, -1, 4}. Output = {-4, 1, -1, 2, 3, 4}
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        alternateElements(arr);
    }
    
    //Brute Force Approach - Time Complexity -> o(N) Space Complexity -> o(N) 
    public static void alternateElements(int[] arr){
        int posElement = 0;
        int negElement = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                posElement++;
            }
            else{
                negElement++;
            }
        }
        int[] posArray = new int[posElement];
        int[] negArray = new int[negElement];
        int posIdx = 0, negIdx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                posArray[posIdx] = arr[i];
                posIdx++;
            }
            else{
                negArray[negIdx] = arr[i];
                negIdx++;
            }
        }
        //Merging altenatively positive and negative arrays in one array
        int i=0, j=0, k=0;
        while(i<posArray.length && j <negArray.length){
            arr[k] = negArray[j];
            j++;
            k++;
            arr[k] = posArray[i];
            k++;
            i++;
        }
        while(i<posArray.length){
            arr[k] = posArray[i];
            k++;
            i++;
        }
        while(j<negArray.length){
            arr[k] = negArray[j];
            k++;
            j++;
        }
        printArray(arr);
    }
    
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
-------------------
output - 
-4 1 -1 2 3 4
