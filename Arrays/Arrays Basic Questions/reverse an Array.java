// Question 5 :- Write JAVA program to reverse an Array
//Question 5 reverse by using Swap method
        int[] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l, 2);    // Math.floorDiv(5, 2) --> is used i.e 5/2 = 2 (floor is for only integer number and ignores decimals  )
        for(int i=0; i<n; i++){               // for loop for swaping elements
            //Swap a[i] and a[l-i-1]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int i= 0; i<l; i++){
            System.out.print(arr[i] + " ");
        }

Code By using direct reverse method➖  (METHOD 2 )
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5 Array Elements:");
        int[] array = new int [5];
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Your Entered Array as below:");
        for(int i= 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The REVERSE Array is below:");
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
=======================
Input:-
Enter your 5 Array Elements:
10 20 30 40 50
Output :-
Your Entered Array as below:
10 20 30 40 50 
The REVERSE Array is below:
50 40 30 20 10
