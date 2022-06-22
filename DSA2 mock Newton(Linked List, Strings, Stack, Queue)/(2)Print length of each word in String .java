// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/java-program-count-characters-word-given-sentence/
Q. Print length of each word in String 
Input : geeks for geeks
Output :geeks->5 for->3 geeks->5
*/
public class Main {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        printLength(str);
    }
     
    //Most Optimal Solution : Time Complexity - O(N) Space Complexity - O(N)
    public static void printLength(String str){
        char[] ch = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            String s = "";
            while(i<ch.length && ch[i] != ' '){
                s = s + ch[i];
                i++;
            }
            if(s.length() > 0){
                System.out.println(s + " = " + s.length());
            }
        }
    }
}

-----------
Output : 
geeks = 5
for = 3
geeks = 5
