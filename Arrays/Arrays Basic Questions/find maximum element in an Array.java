// Question 6 :- Write a JAVA program to find maximum element in  an Array
        int[] arr = {10, 20, 30, 40, 50, -60};
        //Integer.MIN_VALUE for minimum integer value
        int max1 = Integer.MIN_VALUE;           				
        for(int i=0; i<arr.length; i++){ 
            if(arr[i]>max1){  // Here condition is check if true then store new value
                max1 = arr[i];
            }
        }
				System.out.println("The maximum element of an Array is: " + max1);
/* for second largest element in Array 
int max2 = Math.MIN_VALUE;
for(int i=0; i<arr.length; i++){
            if( max2<=arr[i] && arr[i] != max1){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
*/
        
=================
Output :-
The maximum element of an Array is: 50
