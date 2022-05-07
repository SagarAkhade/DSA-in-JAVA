// Question 2 :- Write a program to find out whether a given integer is 
//present in an Array or not
Scanner sc = new Scanner(System.in);
System.out.print("Enter number to be check: ");
int num  = sc.nextInt();
boolean isInArray = false;
int[] values = {10, 20, 30, 40, 50};
for(int i=0; i<values.length; i++){
   if(num==values[i]){
      isInArray = true;
    }
}
if(isInArray){
   System.out.println("Yes your number is present in an Array!!!");
}
else{
    System.out.println("Your number is not present in an Array!!!");
}
=======================
Input:-
Enter number to be check: 60
Output :-
Your number is not present in an Array!!!
