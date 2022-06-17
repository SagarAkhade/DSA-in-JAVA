// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/pangram-checking/
Q. Pangram Checking
Input : "The quick brown fox jumps over the lazy dog"
Output : Is A Panagram
Input : "The quick brown fox jumps over the dog"
Output : Not A Panagram
*/
public class Main {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        
        if(isPanagram(str)){
            System.out.println("Is A Panagram");
        }
        else{
            System.out.println("Is Not A Panagram");
        }
    }
    
    //Most Optimal Solutin : Time Complexity O(N) Space Complexity O(N)
    public static boolean isPanagram(String str){
        boolean[] mark = new boolean[26];
        int index = 0;
        for(int i=0; i<str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
            }
            else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
            }
            else{
                continue;
            }
            mark[index] = true;
        }
        for(int i=0; i<26; i++){
            if(mark[i]==false){
                return false;
            }
        }
        return true;
    }
}

--------------
Output : 
Is A Panagram
