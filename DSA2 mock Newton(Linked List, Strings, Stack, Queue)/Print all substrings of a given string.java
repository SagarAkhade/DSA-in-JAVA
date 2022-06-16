// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/program-print-substrings-given-string/
Q. print all substrings of a given string
Input :  abcd
Output :  a 
          b
          c
          d
          ab
          bc
          cd
          abc
          bcd
          abcd
*/
public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        subStrings(str);
    }
    
    //Optimal Solution : Time Complexity - O(N^3)  Space Complexity - O(1) 
    public static void subStrings(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    //str.substring(i,j) -> is java library function which prints the substrings
}
------
Output : 
a
ab
abc
abcd
b
bc
bcd
c
cd
d
