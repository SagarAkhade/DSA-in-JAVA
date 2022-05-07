// Question 8 :- Write a program to check whether an Array is sorted or not
//(i.e. is increasing order or not)
        int [] arr = {10, 20, 30, 40, 50, 90 };
        boolean isSorted = true;  // We assume that its sorted array
        for(int i =0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("An Array is sorted!!!");
        }
        else{
            System.out.println("An Array is not sorted!!!");
        }
====================
Output :-
An Array is sorted!!!
