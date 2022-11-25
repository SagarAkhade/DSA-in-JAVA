// Question 3:- Calculate average of marks from an Array
float[] marks = { 88, 95, 55, 96, 98};
float sum = 0f;
for(int i = 0; i<marks.length; i++){ 
   sum =sum + marks[i];
}
float avg = sum/marks.length;
System.out.println("The value of average marks is: " + avg);
====================================
Output:-
The value of average marks is: 86.4
