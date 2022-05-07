// Question 7 :- Write a JAVA program to find minimum element in  an Array
        int[] arr = {10, 20, 30, 40, 50, -60};
				//Integer.MAX_VALUE for Maximum integer value
        int min = Integer.MAX_VALUE;           
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){  // Here condition is check if true then store new value
                min = arr[i];
            }
        }
        System.out.println("The maximum element of an Array is: " + min);
====================
Output :-
The minimum element of an Array is: -60
