// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
Q. Reverse all words given in a string and remove all white spaces.
Example :-
Input -  "  hello   good    morning   "   ->> ask in interview 
Output - "morning good hello"
Input - "i like this program very much"
Output - "much very program this like i"
*/
public class Main {
    public static void main(String[] args) {
        String str = "  hello   good    morning   ";
        revString(str);
    }
    
    //Optimal Solution - Time Complexity : O(N) , Space Complexity : O(N)
    public static void revString(String str) {
        // .replaceAll("\\s+"," ") ->> for removing extra whitespaces. 
        //  .split() ->> to convert String in String Array
        String[] stringArray = str.replaceAll("\\s+"," ").trim().split(" ");   
       
        String ans = "";
        for (int i = stringArray.length - 1; i >= 0; i--) {
            ans += stringArray[i] + " ";
        }
        System.out.println(ans);
    }
}

--------------
Output : 
morning good hello 
